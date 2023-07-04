public class MergedKSortedLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node merge(Node head1, Node head2, Node head3) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node temp3 = head3;


        return temp1;
    }
    public static void main(String[] args) {
        Node head1 =new Node(2);
        Node head2 = new Node(1);
        Node head3 = new Node(10);

        head1.next = new Node(4);
        head1.next.next = new Node(6);
        head1.next.next.next = new Node(8);

        head2.next = new Node(3);
        head2.next.next = new Node(5);
        head2.next.next.next = new Node(7);
        head2.next.next.next.next = new Node(9);

        head3.next = new Node(11);
        head3.next.next = new Node(12);
        head3.next.next.next = new Node(13);
    }
}
