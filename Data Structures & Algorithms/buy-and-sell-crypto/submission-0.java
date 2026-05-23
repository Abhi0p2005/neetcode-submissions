class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = 255;
        for(int i = 0 ; i<prices.length;i++){
            if(prices[i]<min)
                    min = prices[i];
           
        for (int sell : prices) {
            max = Math.max(max, sell - min);
            min = Math.min(min, sell);
                }
                return max;


            }
            return 0;
        }
        
    }
