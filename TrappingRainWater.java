class Solution {
    public int trap(int[] height) {
        int arrayLength=height.length;
        int[] leftArray=new int[arrayLength];
        int[] rightArray=new int[arrayLength];
        leftArray[0]=height[0];
        for(int i=1;i<arrayLength;i++)
        {
            leftArray[i]=Math.max(height[i],leftArray[i-1]);
        }
        rightArray[arrayLength-1]=height[arrayLength-1];
        for(int i=arrayLength-2;i>=0;i--)
        {
            rightArray[i]=Math.max(height[i],rightArray[i+1]);
        }
        int waterCapacity=0;
        for(int i=0;i<arrayLength;i++)
        {
            waterCapacity+=Math.min(leftArray[i],rightArray[i])-height[i];
        }
        return waterCapacity;
    }
}
