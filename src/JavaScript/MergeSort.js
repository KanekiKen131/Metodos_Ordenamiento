function mergeSort(arr) {
    if (arr.length <= 1) return arr;

    const medio= Math.floor(arr.length / 2);
    const izquierda = mergeSort(arr.slice(0, medio));
    const derecha   = mergeSort(arr.slice(medio));

    return merge(izquierda, derecha);
}

function merge(izquierda, derecha) {
    let resultado = [];
    while (izquierda.length && derecha.length) {
        if (izquierda[0] < derecha[0]) {
            resultado.push(izquierda.shift());
        } else {
            resultado.push(derecha.shift());
        }
    }
    return [...resultado, ...izquierda, ...derecha];
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

let ordenado = mergeSort(datos);

console.log("Arreglo ordenado (primeros 10):");
mostrarPrimeros(ordenado, 10);
console.log("Total de elementos ordenados:", ordenado.length);og(ordenado);