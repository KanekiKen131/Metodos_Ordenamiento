function selectionSort(arr) {
    let n = arr.length;
    for (let i = 0; i < n - 1; i++) {
        let min = i;
        for (let j = i + 1; j < n; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        [arr[i], arr[min]] = [arr[min], arr[i]];
    }
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

selectionSort(datos);

console.log("Arreglo ordenado (primeros 10):");
mostrarPrimeros(datos, 10);
console.log("Total de elementos ordenados:", datos.length);Sort(datos);