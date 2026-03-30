class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.trim().toLowerCase();

        int left = 0;
        int right = newS.length() - 1;
        while (left < right)
        {
            if (!Character.isLetterOrDigit(newS.charAt(left)))
            {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(newS.charAt(right)))
            {
                right--;
                continue;
            }

            if (newS.charAt(left) != (newS.charAt(right)))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
