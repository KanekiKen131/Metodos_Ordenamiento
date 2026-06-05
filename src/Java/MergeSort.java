public class MergeSort {

    static void mergeSort(int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;
            mergeSort(arr, izquierda, medio);
            mergeSort(arr, medio + 1, derecha);
            merge(arr, izquierda, medio, derecha);
        }
    }

    static void merge(int[] arr, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[izquierda + i];
        for (int j = 0; j < n2; j++) R[j] = arr[medio + 1 + j];

        int i = 0, j = 0, k = izquierda;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { arr[k] = L[i]; i++; }
            else               { arr[k] = R[j]; j++; }
            k++;
        }
        while (i < n1) { arr[k] = L[i]; i++; k++; }
        while (j < n2) { arr[k] = R[j]; j++; k++; }

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

        mergeSort(datos, 0, datos.length - 1);

        System.out.println("Arreglo ordenado (primeros 10):");
        mostrarPrimeros(datos, 10);
        System.out.println("Total de elementos ordenados: " + datos.length);
    }
}