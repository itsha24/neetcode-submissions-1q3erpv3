class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char elem : s.toCharArray())
        {
            if (closeToOpen.containsKey(elem))
            {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(elem))
                    stack.pop();
                else
                    return false;
            }
            else
                stack.push(elem);
        }

        return stack.isEmpty();
    }
}
