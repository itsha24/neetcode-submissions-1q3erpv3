class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> collection = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxSub = 0;

        while (right < s.length())
        {
            while (collection.contains(s.charAt(right)))
            {
                collection.remove(s.charAt(left));
                left++;
            }
            
            collection.add(s.charAt(right));
            maxSub = Math.max(maxSub, right - left + 1);
            right++;
        }

        return maxSub;
    }
}
