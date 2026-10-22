class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] freqList = new List[nums.length + 1];

        for (int i = 0; i < freqList.length; i++)
        {
            freqList[i] = new ArrayList<>();
        }

        for (int num : nums)
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet())
        {
            freqList[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int count = 0;
        for (int l = freqList.length - 1; l > 0; l--)
        {
            for (int n : freqList[l]) {
                result[count++] = n;
                if (count == k) {
                    return result;
                }
            }
        }

        return result;
    }
}
