class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket=new List[nums.length+1];
        HashMap <Integer,Integer> map=new HashSet<>();
        for(int n:nums)
        {
            map.put(num,getOrDefault(num,0)+1);
        }
        for(int num:map.keySet())
        {
            int frequency=map.get(key); 
        }
        return new int[]{0};
    }
}
