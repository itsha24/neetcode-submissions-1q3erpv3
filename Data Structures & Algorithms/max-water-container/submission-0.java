class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxH = 0;

        while (left < right)
        {
            int currH = Math.min(heights[left], heights[right]) * (right - left);
            System.out.println("Current heights: " + heights[left] + " - " + heights[right] + " / Current area: " + currH);
            maxH = Math.max(currH, maxH);

            if (heights[left] >= heights[right])
                right--;
            else
                left++;
        }

        return maxH;
    }
}
