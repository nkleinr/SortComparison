public class SortComparison {

    public static void main(String[] args) {
        int[] array1 = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = array1.clone();

        // BubbleSort timing
        BubbleSort bubbleSort = new BubbleSort();
        long startBubble = System.nanoTime();
        bubbleSort.sort(array1);
        long endBubble = System.nanoTime();

        // MergeSort timing
        MergeSort mergeSort = new MergeSort();
        long startMerge = System.nanoTime();
        mergeSort.sort(array2, 0, array2.length - 1);
        long endMerge = System.nanoTime();

        // Output the results
        System.out.println("BubbleSort took " + (endBubble - startBubble) + " ns");
        System.out.println("MergeSort took " + (endMerge - startMerge) + " ns");
    }
}
