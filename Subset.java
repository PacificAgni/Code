class Solution {
    //TC=O(n*2^n)
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList=new ArrayList<>();
        backtrack(resultList,new ArrayList(),nums,0);
        return resultList;
    }
    private void backtrack(List<List<Integer>> resultList,List<Integer> subList,int[] nums,int start)
    {
        resultList.add(new ArrayList(subList));
        for(int i=start;i<nums.length;i++)
        {
            subList.add(nums[i]);
            System.out.println(subList);
            backtrack(resultList,subList,nums,i+1);
            subList.remove(subList.size()-1);
        }
    }
}
