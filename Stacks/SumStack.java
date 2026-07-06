package Stacks;

import java.util.Stack;

public class SumStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int sum = 0;
        for(int i : stack) {
            sum += i;
        }
        System.out.println(sum);
    }
}
