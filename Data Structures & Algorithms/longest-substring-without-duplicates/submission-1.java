class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> subs = new HashSet<>();
        int left = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++)
        {
            while (subs.contains(s.charAt(right)))
            {
                subs.remove(s.charAt(left));
                left++;
            }
            subs.add(s.charAt(right));
            longest = Math.max(right - left + 1, longest);
        }

        return longest;
    }
}
