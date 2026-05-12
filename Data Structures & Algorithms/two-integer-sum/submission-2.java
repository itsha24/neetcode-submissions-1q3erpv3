class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> inputs = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if (inputs.containsKey(complement))
                return new int[] {inputs.get(complement), i};
            inputs.put(nums[i], i);
        }

        return new int[] {};
    }
}
