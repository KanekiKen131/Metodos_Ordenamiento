function bubbleSort(arr) {
    let n = arr.length;
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

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

bubbleSort(datos);

console.log("Arreglo ordenado (primeros 10):");
mostrarPrimeros(datos, 10);
console.log("Total de elementos ordenados:", datos.length);