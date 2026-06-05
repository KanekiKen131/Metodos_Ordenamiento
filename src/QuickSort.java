public class QuickSort {

    static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particion(arreglo, inicio, fin);
            quickSort(arreglo, inicio, pivote - 1);
            quickSort(arreglo, pivote + 1, fin);
        }
    }

    static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (arr[j] < pivote) {
                i++;
                int temp = arr[i];
                arr[i]   = arr[j];
                arr[j]   = temp;
            }
        }
        int temp   = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin]   = temp;
        return i + 1;
    }

    static void mostrar(int[] arr) {
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

        quickSort(datos, 0, datos.length - 1);

        System.out.println("Arreglo ordenado (primeros 10):");
        mostrarPrimeros(datos, 10);
        System.out.println("Total de elementos ordenados: " + datos.length);
    }

}