class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int initPrice = prices[0];

        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] < initPrice)
                initPrice = prices[i];
            else
            {
                int curr = prices[i] - initPrice;
                max = Math.max(curr, max);
            }
        }

        return max;
    }
}
