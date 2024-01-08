class Solution {
    public int search(int[] nums, int target) {
        int length=nums.length;
        int left=0;
        int right=length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            return mid;
            if(nums[mid]<=nums[right])
            {
                if(nums[mid]<target && nums[right]>=target)
                    left=mid+1;
                else
                    right=mid-1;
            }
            if(nums[left]<=nums[mid])
            {
                if(target>=nums[left] && target<nums[mid])
                {
                    right=mid-1;
                }
                else
                    left=mid+1;
            }
        }
        return -1;
    }
}
