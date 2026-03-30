class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> sCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : sCount.entrySet())
        {
            char key = entry.getKey();
            Integer value = entry.getValue();
            if (!tCount.containsKey(key) || !tCount.get(key).equals(value))
                return false;
        }

        return true;
    }
}
