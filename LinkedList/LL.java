package LinkedList;

public class LL {
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

    // Print a LL
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // addFirst - O(1)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // addLast - O(n)
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // removeFirst - O(1)
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    // removeLast - O(n)
    public void removeLast() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // iterative search - O(n)
    public boolean search(int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key)
                return true;
            curr = curr.next;
        }
        return false;
    }

    // size of LL - O(n)
    public int size() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // reverse of LL - O(n)
    public void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(20);
        list.addFirst(10);

        list.addLast(30);
        list.addLast(40);

        list.printList();

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();
    }
}

// Search an element
// LinkedList<String> list = new LinkedList<>();

// list.add("Java");
// list.add("Python");
// list.add("C++");

// if(list.contains("Python"))
// System.out.println("Found");
// else
// System.out.println("Not Found");

// reverse
// Collections.reverse(list);

// iterator
// LinkedList<Integer> list = new LinkedList<>();

// list.add(100);
// list.add(200);
// list.add(300);

// Iterator<Integer> it = list.iterator();

// while(it.hasNext()) {
// System.out.println(it.next());
// }

// all even numbers
// Iterator<Integer> it = list.iterator();

// while(it.hasNext()) {
// if(it.next() % 2 == 0)
// it.remove();
// }

// System.out.println(list);
// }