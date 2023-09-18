
public class ElementarySorting {
    public static void main(String[] args) {
        int[] arr = {10,52,63,1,85,9};

        System.err.println("Unsorted: ");
        for (int a : arr) {
                System.out.print(a + ", ");
        }

        System.out.println("\n");
        bubbleSort(arr);

    }

    static void insertionSort(int[] arr){
        System.out.println("Insertion Sort: ");

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;


            //print each iteration
            for (int a : arr) {
                System.out.print(a + ", ");
            }
            System.out.println("");
        }

    }
    static void bubbleSort(int[] arr){
        System.out.println("Bubble Sort: ");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

            //print each iteration
            for (int a : arr) {
                System.out.print(a + ", ");
            }
            System.out.println("");
        }

    }
    static void selectionSort(int[] arr){

         System.out.println("Selection Sort: ");

        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

            //print each iteration
            for (int a : arr) {
                System.out.print(a + ", ");
            }
            System.out.println("");
        }

    }
}
