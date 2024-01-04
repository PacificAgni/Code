import java.util.*;
class  TwoSum{
    public static void main(String args[])
    {
        int[] arr={1,3,2,5,4};
        System.out.println(Arrays.toString(arr));
        int target=8;
        int[] results=twoSum(arr,target);
        System.out.println(Arrays.toString(results));
    }
    public static int[] twoSum(int[] arr, int target) {
       int n=arr.length;
     //Brute Force Approach  
    //    for(int i=0;i<n-1;i++)
    //    {
    //        for(int j=i+1;j<n;j++)
    //        {
    //            if(arr[j]+arr[i]==target)
    //            return new int[]{i,j};
    //        }
           
    //    }

    //Optimal Solution
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<n;i++)
     {
         int complement=target-arr[i];
         if(map.containsKey(complement))
         {
             return new int[]{map.get(complement),i};
         }
         map.put(arr[i],i);

     }

         return new int[]{0,0};
    }
}
