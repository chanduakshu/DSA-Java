public class MaxSubArray {

    /**
     * Finds the contiguous subarray with the largest sum using Kadane's Algorithm.
     * 
     * @param nums The integer array.
     * @return The maximum subarray sum.
     */
    public static int maxSubArray(int[] nums) {
        // Initialize max_so_far with the first element (or Integer.MIN_VALUE for edge cases like empty arrays, 
        // but problem constraints usually guarantee non-empty).
        int max_so_far = nums[0];
        // Initialize current_max to the first element
        int current_max = nums[0];

        // Start from the second element
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            
            // Calculate the maximum sum ending at the current position:
            // Either extend the previous subarray or start a new one from the current element.
            current_max = Math.max(num, current_max + num);
            
            // Update the overall maximum sum found so far.
            max_so_far = Math.max(max_so_far, current_max);
        }

        return max_so_far;
    }

    public static void main(String[] args) {
        // Example 1: The subarray [4, -1, 2, 1] has the largest sum 6.
        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum for arr1: " + maxSubArray(arr1)); // Output: 6

        // Example 2: The subarray [1] has the largest sum 1.
        int[] arr2 = {1};
        System.out.println("Maximum subarray sum for arr2: " + maxSubArray(arr2)); // Output: 1

        // Example 3: The subarray [5, 4, -1, 7, 8] has the largest sum 23.
        int[] arr3 = {5, 4, -1, 7, 8};
        System.out.println("Maximum subarray sum for arr3: " + maxSubArray(arr3)); // Output: 23
    }
}
