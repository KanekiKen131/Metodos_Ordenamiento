import random
import time
import sys

sys.setrecursionlimit(2_000_000)

def particion(arr, inicio, fin):
    # Pivote aleatorio: evita el peor caso O(n^2) con datos ya ordenados
    idx_pivote = random.randint(inicio, fin)
    arr[idx_pivote], arr[fin] = arr[fin], arr[idx_pivote]

    pivote = arr[fin]
    i = inicio - 1

    for j in range(inicio, fin):
        if arr[j] <= pivote:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]

    arr[i + 1], arr[fin] = arr[fin], arr[i + 1]
    return i + 1

def quick_sort(arr, inicio, fin):
    while inicio < fin:
        p = particion(arr, inicio, fin)
        # Recursion solo en el lado mas pequeno (reduce profundidad de pila)
        if (p - inicio) < (fin - p):
            quick_sort(arr, inicio, p - 1)
            inicio = p + 1
        else:
            quick_sort(arr, p + 1, fin)
            fin = p - 1

N = 1_000_000
datos = random.sample(range(N * 10), N)

print(f"Arreglo original (primeros 10): {datos[:10]}")
print(f"Total de datos: {N:,}")
print("Ordenando con Quick Sort (pivote aleatorio)...")

inicio_t = time.time()
quick_sort(datos, 0, len(datos) - 1)
fin_t = time.time()

print(f"Arreglo ordenado (primeros 10): {datos[:10]}")
print(f"Arreglo ordenado (ultimos 10):  {datos[-10:]}")
print(f"Tiempo total: {fin_t - inicio_t:.2f} segundos")