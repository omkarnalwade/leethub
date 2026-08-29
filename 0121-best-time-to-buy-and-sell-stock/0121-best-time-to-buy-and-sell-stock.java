class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxp=0;

        for(int i=0;i<prices.length;i++){
            int p=prices[i]-min;
            if(p>maxp) maxp=p;
            if(prices[i]<min) min = prices[i];
        }
        return maxp;
        
    }
}