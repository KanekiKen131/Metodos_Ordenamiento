function insertionSort(arr) {
    for (let i = 1; i < arr.length; i++) {
        let actual = arr[i];
        let j = i - 1;
        while (j >= 0 && arr[j] > actual) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = actual;
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

insertionSort(datos);

console.log("Arreglo ordenado (primeros 10):");
mostrarPrimeros(datos, 10);
console.log("Total de elementos ordenados:", datos.length);ionSort(datos);