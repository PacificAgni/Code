class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=Integer.MAX_VALUE,profit=0;
        min=prices[0];
        max=prices[0];
        int i=0;
        while(i<prices.length-1)
        {
           while(i<prices.length-1 && prices[i]>=prices[i+1])
           i++;
           min=prices[i];

           while(i<prices.length-1 && prices[i]<=prices[i+1])
           i++;
           max=prices[i];
            profit+=max-min;
        }
        return profit;
    }
}
