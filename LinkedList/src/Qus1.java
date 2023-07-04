public class Qus1 {
    //Delete N Nodes After M Nodes of a Linked List

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void deleteNNodes( int M, int N) {
        Node temp = head;
        Node ptr = head;
        int i = 1;
        while (i < M && temp != null) {
            temp = temp.next;

            i++;
        }
        ptr = temp.next;
        i = 1;
        while (i <= N && ptr != null) {
            ptr = ptr.next;
            i++;
        }
        temp.next = ptr;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail= newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        Node ptr = head;
        if (head == null) {
            System.out.println("Empty LL");
            return;
        }
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        Qus1 ll = new Qus1();
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(8);
        ll.addLast(10);

        ll.deleteNNodes(2,2);
        ll.display();
    }
}