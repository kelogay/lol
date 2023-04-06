class LLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {

        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Node Is Null.");
            return;
        }

        Node Curnode = head;
        while (Curnode != null) {
            System.out.print(Curnode.data + " -> ");
            Curnode = Curnode.next;
        }
        System.out.println("Null.");
    }

    public void max() {
        if (head == null) {
            System.out.println("Node Is Null.");
            return;
        }

        Node cur = head;

        int max = head.data;
        while (cur != null) {
            if (cur.data > max) {
                max = cur.data;
            }
            cur = cur.next;
        }
        System.out.println(max + " The Biggest node.");
    }

    public void min() {
        if (head == null) {
            System.out.println("Node Is Null.");
            return;
        }

        Node currr = head;

        int min = head.data;

        while (currr != null) {
            if (currr.data < min) {
                min = currr.data;
            }
            currr = currr.next;
        }
        System.out.println(min + " The Smallest node.");

    }

    public void delete() {
        if (head == null) {
            System.out.println("Node Is Null.");
            return;
        }
        head = head.next;
    }

    public static void main(String args[]) {
        LLL list = new LLL();

        list.add(20);
        list.add(40);

        list.print();
        list.max();
        list.min();
    }
}