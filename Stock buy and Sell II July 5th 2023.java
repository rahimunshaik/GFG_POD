https://practice.geeksforgeeks.org/problems/stock-buy-and-sell2615/1

class Solution {
    public static int stockBuyAndSell(int n, int[] prices) {
        // code here
        int profit=0;
        int buyingDayPrice=prices[0];
        for(int i=1; i<n; i++)
        {
            if (prices[i] < buyingDayPrice)
            {
                // profit+=prices[i]-prices[i-1];
                
                buyingDayPrice=prices[i];
            }else if(prices[i] > buyingDayPrice){
                profit+=prices[i]-buyingDayPrice;
                buyingDayPrice=prices[i];
                
            }
        }
        return profit;
    }
}
    
