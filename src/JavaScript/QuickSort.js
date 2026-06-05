function quickSort(arr, inicio, fin) {
    if (inicio < fin) {
        let pivote = particion(arr, inicio, fin);
        quickSort(arr, inicio, pivote - 1);
        quickSort(arr, pivote + 1, fin);
    }
}

function particion(arr, inicio, fin) {
    let pivote = arr[fin];
    let i = inicio - 1;
    for (let j = inicio; j < fin; j++) {
        if (arr[j] < pivote) {
            i++;
            [arr[i], arr[j]] = [arr[j], arr[i]];

        }
    }
    [arr[i + 1], arr[fin]] = [arr[fin], arr[i + 1]];
    return i + 1;
}

function generarAleatorio(n, maxVal) {
    let arr = [];
    for (let i = 0; i < n; i++) {
        arr.push(Math.floor(Math.random() * maxVal) + 1);
    }
    return arr;
}

function mostrarPrimeros(arr, cantidad) {
    const vista = arr.slice(0, cantidad);
    console.log(arr.length > cantidad ? `[${vista.join(", ")}, ...]` : `[${vista.join(", ")}]`);
}

let n      = 1000;
let maxVal = 10000;
let datos  = generarAleatorio(n, maxVal);

console.log("Arreglo original (primeros 10):");
mostrarPrimeros(datos, 10);

quickSort(datos, 0, datos.length - 1);

console.log("Arreglo ordenado (primeros 10):");
mostrarPrimeros(datos, 10);
console.log("Total de elementos ordenados:", datos.length);