class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target) return m;

            // Step 1: Identify which side is sorted
            if (nums[l] <= nums[m]) {
                // Left side is sorted
                if (target >= nums[l] && target < nums[m]) {
                    r = m - 1; // Target is in the sorted left
                } else {
                    l = m + 1; // Target must be in the right
                }
            } else {
                // Right side is sorted
                if (target > nums[m] && target <= nums[r]) {
                    l = m + 1; // Target is in the sorted right
                } else {
                    r = m - 1; // Target must be in the left
                }
            }
        }
        return -1;
    }
}