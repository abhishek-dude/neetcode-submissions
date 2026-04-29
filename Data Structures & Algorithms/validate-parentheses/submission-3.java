class Solution {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If stack is empty, no matching opening bracket
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check if the closing bracket matches the top
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        // Valid only if all brackets were matched
        return stack.isEmpty();
    }
}