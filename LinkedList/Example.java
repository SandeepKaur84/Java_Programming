// package LinkedList;

// public class Example {
//     static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     Node head =  null;
//     Node tail = null;

//     public void printLL() {
//         if(head == null) {
//             System.out.println("LL is emply");
//             return;
//         }

//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Node n1 = new Node(10);
//         Node n2 = new Node(20);
//         Node n3 = new Node(30);

//         n1.next = n2;
//         n2.next = n3;
//         Node Head = n1;
//         printLL();
//     }
// }
package LinkedList;

import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15);
        list.addFirst(5);
        list.addLast(35);
        System.out.println(list);
        // System.out.println(list.get(3));
        // System.out.println(list.getLast());
        // list.remove(4);
        // System.out.println(list);
        // list.clear();
        // System.out.println(list);
        list.remove(Integer.valueOf(15));
        System.out.println(list);
        list.removeAll(list);
        System.out.println(list);
    }
}