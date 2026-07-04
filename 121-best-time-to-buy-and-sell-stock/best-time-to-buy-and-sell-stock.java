class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit =Integer.MIN_VALUE;

        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
           if(prices[i]<minPrice){
            minPrice =prices[i];
           }

           maxProfit =Math.max(prices[i]-minPrice,maxProfit);
        }

        return maxProfit;
    }
}