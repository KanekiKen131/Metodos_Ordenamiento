import random
import time

def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        intercambios = 0
        for j in range(n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                intercambios += 1
        # Optimizacion: si no hubo intercambios, ya esta ordenado
        if intercambios == 0:
            break

N = 1_000_000
datos = random.sample(range(N * 10), N)

print(f"Arreglo original (primeros 10): {datos[:10]}")
print(f"Total de datos: {N:,}")
print("Ordenando con Bubble Sort optimizado...")
print("(Nota: Bubble Sort es O(n^2), puede tardar varios minutos con 1 millon de datos)")

inicio = time.time()
bubble_sort(datos)
fin = time.time()

print(f"Arreglo ordenado (primeros 10): {datos[:10]}")
print(f"Arreglo ordenado (ultimos 10):  {datos[-10:]}")
print(f"Tiempo total: {fin - inicio:.2f} segundos")