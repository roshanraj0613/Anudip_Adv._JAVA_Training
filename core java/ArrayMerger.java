public class ArrayMerger {
    public int[] mergeSortedArrays(int[] array1, int[] array2) {
        // Create a new array to store the merged array
        int[] mergedArray = new int[array1.length + array2.length];
        // Initialize the pointers for array1, array2, and mergedArray
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            // If the current element of array1 is less than or equal to the current element of array2
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                // If the current element of array2 is less than the current element of array1
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < array1.length) {
            // If there are remaining elements in array1
            mergedArray[k++] = array1[i++];
        }

        while (j < array2.length) {
            // If there are remaining elements in array2
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}

class MainFunction4 {
    // Main function to test the ArrayMerger class
    public static void main(String[] args) {
        // Create an object of ArrayMerger
        ArrayMerger arrayMerger = new ArrayMerger();
        // Create two sorted arrays
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        int[] mergedArray = arrayMerger.mergeSortedArrays(array1, array2);

        for (int i : mergedArray) {
            // Print the merged array
            System.out.print(i + " ");
        }
    }
}