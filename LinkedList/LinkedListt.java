package LinkedList;

public class LinkedListt {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public void addFirst() {
        Node newNode = new Node(5);
        newNode.next = head;
        head = newNode;
    }

    public void addLast() {
        Node lastNode = new Node(40);
        tail.next = lastNode;
        tail = lastNode;
    }

    public void removeFirst() {
        head = head.next;
    }

    public void removeLast() {
        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListt list = new LinkedListt();
        Node n1 = list.new Node(10);
        Node n2 = list.new Node(20);
        Node n3 = list.new Node(30);

        n1.next = n2;
        n2.next = n3;
        list.head = n1;
        list.tail = n3;

        list.printLL();
        list.addFirst();
        list.printLL();
        list.addLast();
        list.printLL();
        list.removeLast();
        list.printLL();
    }
}
