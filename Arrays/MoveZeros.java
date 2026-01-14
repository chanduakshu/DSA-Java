import java.util.Arrays;

public class MoveZeros {

    /**
     * Moves all 0's to the end of the array while maintaining the relative order 
     * of the non-zero elements.
     * This is an in-place operation and does not make a copy of the array.
     *
     * @param nums The input integer array.
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        // 'insertPos' (or 'k') tracks the position where the next non-zero element should be placed
        int insertPos = 0; 

        // Iterate through the array with 'i'
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, place it at 'insertPos'
            if (nums[i] != 0) {
                // To do this in-place effectively without a second loop to fill zeros, 
                // we can swap the non-zero element with the element at insertPos.
                // If i and insertPos are the same (no zeros encountered yet), it's a self-swap.
                if (i != insertPos) {
                    int temp = nums[i];
                    nums[i] = nums[insertPos];
                    nums[insertPos] = temp;
                }
                insertPos++;
            }
        }
    }

    // A main method to test the functionality
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};
        MoveZeros solution = new MoveZeros();
        System.out.println("Original array: " + Arrays.toString(arr1));
        solution.moveZeroes(arr1);
        System.out.println("Modified array: " + Arrays.toString(arr1));
        // Expected output: [1, 3, 12, 0, 0]

        int[] arr2 = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.println("\nOriginal array: " + Arrays.toString(arr2));
        solution.moveZeroes(arr2);
        System.out.println("Modified array: " + Arrays.toString(arr2));
    }
}
