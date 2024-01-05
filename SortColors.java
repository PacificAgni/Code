class SortColors {
    public  void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public void sortColors(int[] nums) {
    //Dutch National Flag Algorithm
    int n=nums.length;
     int current,low,high;
     current=0;
     low=0;
     high=n-1;
     for(int i=0;i<n;i++)
    {
        if(nums[current]==0)
        {
            swap(nums,current,low);
            low++;
            current++;
        }
        else if(nums[current]==2)
        {
            swap(nums,current,high);
            high--;
        }
        else{
            current++;
        }
    }   
    }
}
