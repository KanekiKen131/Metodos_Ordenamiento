import random
import time

def merge_sort(arr):
    if len(arr) > 1:
        medio = len(arr) // 2
        izquierda = arr[:medio]
        derecha = arr[medio:]

        merge_sort(izquierda)
        merge_sort(derecha)

        i = 0
        j = 0
        k = 0

        while i < len(izquierda) and j < len(derecha):
            if izquierda[i] < derecha[j]:
                arr[k] = izquierda[i]
                i += 1
            else:
                arr[k] = derecha[j]
                j += 1
            k += 1

        while i < len(izquierda):
            arr[k] = izquierda[i]
            i += 1
            k += 1

        while j < len(derecha):
            arr[k] = derecha[j]
            j += 1
            k += 1

import sys
sys.setrecursionlimit(2_000_000)

N = 1_000_000
datos = random.sample(range(N * 10), N)

print(f"Arreglo original (primeros 10): {datos[:10]}")
print(f"Total de datos: {N:,}")
print("Ordenando con Merge Sort...")

inicio = time.time()
merge_sort(datos)
fin = time.time()

print(f"Arreglo ordenado (primeros 10): {datos[:10]}")
print(f"Arreglo ordenado (ultimos 10):  {datos[-10:]}")
print(f"Tiempo total: {fin - inicio:.2f} segundos")