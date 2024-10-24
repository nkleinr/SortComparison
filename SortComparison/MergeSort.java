public class MergeSort {

    // Function to merge two subarrays
    private void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i) 
            leftArray[i] = array[left + i];
        for (int j = 0; j < n2; ++j) 
            rightArray[j] = array[middle + 1 + j];

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[]
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[]
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Function to implement MergeSort
    public void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Sort first and second halves
            sort(array, left, middle);
            sort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = {12, 11, 13, 5, 6, 7};
        
        System.out.println("Given array:");
        for (int num : array)
            System.out.print(num + " ");
        
        mergeSort.sort(array, 0, array.length - 1);

        System.out.println("\nSorted array:");
        for (int num : array)
            System.out.print(num + " ");
    }
}
