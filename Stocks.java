class Solution {
    public int maxProfit(int[] prices) {
     int min=prices[0];
     int maxProfit=0;
     for(int i=1;i<prices.length;i++)
     {
         maxProfit=maxProfit>prices[i]-min?maxProfit:prices[i]-min;
         min=min<prices[i]?min:prices[i];
     }   
     return maxProfit;
    }
}
