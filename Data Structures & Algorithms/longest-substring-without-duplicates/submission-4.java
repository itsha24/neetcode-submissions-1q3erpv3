class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> subSet = new HashSet<>();
        int maxLength = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++)
        {
            while (subSet.contains(s.charAt(r)))
            {
                subSet.remove(s.charAt(l));
                l++;
            }
            subSet.add(s.charAt(r));
            maxLength = Math.max(maxLength, (r - l + 1));
        }

        return maxLength;
    }
}
