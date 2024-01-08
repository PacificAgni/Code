class Solution {
    public int findMin(int[] nums) {
        int length=nums.length;
        int left=0;
        int right=length-1;
        int min=Integer.MAX_VALUE;
        while(left<=right)        
        {
            int mid=left+(right-left)/2;
            if(nums[left]<=nums[mid])
            {
                min=min<nums[left]?min:nums[left];
                left=mid+1;
            }
            else if(nums[mid]<=nums[right])
            {
                min=min<nums[mid]?min:nums[mid];
                right=mid-1;
            }
        }
        return min;
    }
}
