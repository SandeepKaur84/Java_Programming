package Queues;

// import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Example {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        // Queue<Integer> q2 = new ArrayDeque<>();
        q1.add(5);
        q1.add(10);
        q1.add(15);

        while(!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
        System.out.println(q1);
    }
}
