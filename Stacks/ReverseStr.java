package Stacks;

import java.util.Stack;

public class ReverseStr {
    public static void main(String[] args) {
        String str = "helloo";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stack.push(ch);
        }
        StringBuilder reverse = new StringBuilder();
        while(!stack.isEmpty()) {
            reverse.append(stack.pop());
        }
        System.out.println(reverse);
    }
}
