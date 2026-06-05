public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mostrarArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    // Genera n números aleatorios en [1, maxVal]
    public static int[] generarAleatorio(int n, int maxVal) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * maxVal) + 1;
        }
        return arr;
    }

    // Muestra solo los primeros 'cantidad' elementos
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

        bubbleSort(datos);

        System.out.println("Arreglo ordenado (primeros 10):");
        mostrarPrimeros(datos, 10);
        System.out.println("Total de elementos ordenados: " + datos.length);
    }
}