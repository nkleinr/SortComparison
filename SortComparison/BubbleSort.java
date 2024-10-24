public class BubbleSort {

    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Given array:");
        for (int num : array)
            System.out.print(num + " ");
        
        bubbleSort.sort(array);

        System.out.println("\nSorted array:");
        for (int num : array)
            System.out.print(num + " ");
    }
}
