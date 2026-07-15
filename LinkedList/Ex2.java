package LinkedList;

// import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        // LinkedList<Integer> ll = new LinkedList<>();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        n1.next = n2;
        System.out.println(n1.next.data);
    }
}
