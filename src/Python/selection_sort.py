import random
import time

def selection_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        minimo = i
        for j in range(i + 1, n):
            if arr[j] < arr[minimo]:
                minimo = j
        arr[i], arr[minimo] = arr[minimo], arr[i]

N = 1_000_000
datos = random.sample(range(N * 10), N)

print(f"Arreglo original (primeros 10): {datos[:10]}")
print(f"Total de datos: {N:,}")
print("Ordenando con Selection Sort...")
print("(Nota: puede tardar varios minutos con 1 millon de datos)")

inicio = time.time()
selection_sort(datos)
fin = time.time()

print(f"Arreglo ordenado (primeros 10): {datos[:10]}")
print(f"Arreglo ordenado (ultimos 10):  {datos[-10:]}")
print(f"Tiempo total: {fin - inicio:.2f} segundos")