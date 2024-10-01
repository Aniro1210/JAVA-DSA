package LinkedList;

public class linkedList1 {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void add(int data, int idx) {
        if (head == null) {
            addFirst(data);
            return;

        }
        Node newNode = new Node(data);
        Node temp;
        temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        linkedList1 ll = new linkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(3);
        ll.print();
        ll.add(9, 1);
        ll.print();

    }

}
