class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;

        while (r < prices.length)
        {
            if (prices[l] > prices[r])
                l = r;
            else
            {
                int profit = prices[r] - prices[l];
                maxP = Math.max(profit, maxP);
            }

            r++;
        }

        return maxP;
    }
}
