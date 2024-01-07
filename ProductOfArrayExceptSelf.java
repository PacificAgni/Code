class Solution {
    public int[] productExceptSelf(int[] nums) {
               int n = nums.length;

        // Initialize arrays to store products to the left and right of each element
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        // Initialize the result array
        int[] result = new int[n];

        // Calculate left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            leftProducts[i] = leftProduct;
            leftProduct *= nums[i];
        }
        System.out.println(Arrays.toString(leftProducts));

        // Calculate right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            rightProducts[i] = rightProduct;
            rightProduct *= nums[i];
        }

        System.out.println(Arrays.toString(rightProducts));

        // Calculate the final result array
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
        
    }
}
