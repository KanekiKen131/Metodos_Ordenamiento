public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]   = temp;
        }
    }

    public static void mostrar(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] generarAleatorio(int n, int maxVal) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * maxVal) + 1;
        }
        return arr;
    }

    public static void mostrarPrimeros(int[] arr, int cantidad) {
        int vista = Math.min(cantidad, arr.length);
        for (int i = 0; i < vista; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr.length > vista ? "..." : "");
    }

    public static void main(String[] args) {
        int n      = 1000;
        int maxVal = 10000;
        int[] datos = generarAleatorio(n, maxVal);

        System.out.println("Arreglo original (primeros 10):");
        mostrarPrimeros(datos, 10);

        selectionSort(datos);

        System.out.println("Arreglo ordenado (primeros 10):");
        mostrarPrimeros(datos, 10);
        System.out.println("Total de elementos ordenados: " + datos.length);
    }
}