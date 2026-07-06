package Stacks;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if ((stack.peek() == '(' && ch == ')') ||
                        stack.peek() == '{' && ch == '}' ||
                        stack.peek() == '[' && ch == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // s = "()[]{}"
        // s2 = "(]"
        // s3 = ")("
        String s = "{[()]";
        System.out.println(isValidParentheses(s));
    }
}
