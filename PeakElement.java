class Solution {
    public int findPeakElement(int[] nums) {
         int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare the middle element with its neighbors
            if (nums[mid] > nums[mid + 1]) {
                // The peak element is likely on the left side
                right = mid;
            } else {
                // The peak element is likely on the right side
                left = mid + 1;
            }
        }

        // At the end of the loop, left and right will be pointing to the same index, which is a peak element
        return left;  
    }
}
