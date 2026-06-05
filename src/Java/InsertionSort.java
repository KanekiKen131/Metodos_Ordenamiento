public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int actual = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > actual) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
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

        insertionSort(datos);

        System.out.println("Arreglo ordenado (primeros 10):");
        mostrarPrimeros(datos, 10);
        System.out.println("Total de elementos ordenados: " + datos.length);
    }
}