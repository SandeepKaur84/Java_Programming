package Stacks;

import java.util.Stack;

public class Example {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // System.out.println(stack.peek());
        // stack.pop();
        // System.out.println(stack.peek());
        // System.out.println(stack);
        // System.out.println(stack.isEmpty());
        // System.out.println(stack.size());
        // stack.clear();
        // System.out.println(stack);
        for(int i : stack) {
            System.out.print(i + " ");
        }
    }
}
