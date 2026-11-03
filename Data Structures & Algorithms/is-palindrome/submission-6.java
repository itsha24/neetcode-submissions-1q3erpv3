class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.trim().toLowerCase();

        int start = 0;
        int end = newS.length() - 1;
        while (start < end)
        {
            if (!Character.isLetterOrDigit(newS.charAt(start)))
                start++;
            else if (!Character.isLetterOrDigit(newS.charAt(end)))
                end--;
            else
            {
                if (newS.charAt(start) != newS.charAt(end))
                    return false;
                start++;
                end--;
            }
        }

        return true;
    }
}
