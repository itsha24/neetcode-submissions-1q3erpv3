class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> dups = new HashMap<>();

        for (int num : nums)
        {
            if (dups.containsKey(num))
                return true;
            dups.put(num, 0);
        }

        return false;
    }
}