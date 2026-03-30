class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String elem : strs)
        {
            char[] current = elem.toCharArray();
            Arrays.sort(current);
            String sortedStr = new String(current);

            if (!groups.containsKey(sortedStr))
                groups.put(sortedStr, new ArrayList<>());
            groups.get(sortedStr).add(elem);
        }

        return new ArrayList (groups.values());
    }
}
