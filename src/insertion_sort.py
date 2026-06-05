import random
import time

def insertion_sort(arr):
    for i in range(1, len(arr)):
        actual = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > actual:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = actual

N = 1_000_000
datos = random.sample(range(N * 10), N)

print(f"Arreglo original (primeros 10): {datos[:10]}")
print(f"Total de datos: {N:,}")
print("Ordenando con Insertion Sort...")
print("(Nota: Insertion Sort es O(n^2), puede tardar varios minutos con 1 millon de datos)")

inicio = time.time()
insertion_sort(datos)
fin = time.time()

print(f"Arreglo ordenado (primeros 10): {datos[:10]}")
print(f"Arreglo ordenado (ultimos 10):  {datos[-10:]}")
print(f"Tiempo total: {fin - inicio:.2f} segundos")