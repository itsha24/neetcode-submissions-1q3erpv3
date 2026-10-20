class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (int i = 0; i < strs.length; i++)
        {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);

            if (!groups.containsKey(sorted))
                groups.put(sorted, new ArrayList<>());
            
            groups.get(sorted).add(strs[i]);     
        }

        return new ArrayList<>(groups.values());
    }
}
