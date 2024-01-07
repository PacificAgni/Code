class Solution {
    public int maxArea(int[] height) {
     int left=0;
    int right=height.length-1;
    int max=0;
    while(left<right)
    {
        int min=Math.min(height[left],height[right]);
        int formula=(right-left)*Math.min(height[left],height[right]);
        max=max>formula?max:formula;
        if(height[left]<height[right])
        left++;
        else
        right--;
    }
    return max;
}
}
