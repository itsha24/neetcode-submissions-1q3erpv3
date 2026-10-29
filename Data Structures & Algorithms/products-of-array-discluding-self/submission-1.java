class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int[] pref = new int[length];
        int[] suff = new int[length];

        pref[0] = 1;
        suff[length - 1] = 1;

        for (int i = 1; i < length; i++)
        {
            pref[i] = nums[i - 1] * pref[i - 1];
        }

        for (int i = length - 2; i >= 0; i--)
        {
            suff[i] = nums[i + 1] * suff[i + 1];
        }

        for (int i = 0; i < length; i++)
        {
            result[i] = pref[i] * suff[i];
        }
        
        return result;
    }
}  
