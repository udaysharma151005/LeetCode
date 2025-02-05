import java.util.Stack;
class Solution {
    public boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }
    private String getString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
