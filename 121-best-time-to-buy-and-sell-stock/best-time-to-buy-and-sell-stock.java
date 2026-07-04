class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int maxProfit =Integer.MIN_VALUE;

        int minPrice=prices[0];

        for(int i=1;i<prices.length;i++){
           
           minPrice =Math.min(prices[i],minPrice);

           maxProfit =Math.max(prices[i]-minPrice,maxProfit);
        }

        return maxProfit;
    }
}