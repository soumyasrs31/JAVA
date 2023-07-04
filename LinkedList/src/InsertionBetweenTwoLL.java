public class InsertionBetweenTwoLL {

    //Intersection of Two Linked Lists
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    public static Node insertBetweenTwoLL(Node head1, Node head2){

        while(head2 != null){
            Node temp = head1;
            while(temp != null){
                if(temp == head2){
                    return head2;
                }
                temp = temp.next;
            }
            head2= head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        InsertionBetweenTwoLL ll = new InsertionBetweenTwoLL();
        Node head1 = new Node(2);
        Node head2 = new Node(10);
        Node newNode = new Node(12);
        head2.next = newNode;
        newNode = new Node(14);
        head2.next.next = newNode;

        newNode = new Node(4);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(6);
        head1.next.next = newNode;


        newNode = new Node(8);
        head1.next.next.next= newNode;
        head1.next.next.next.next = null;

        Node insertPoint = ll.insertBetweenTwoLL(head1,head2);
        if(insertPoint == null){
            System.out.println("no insertion happen");
        }else{
            System.out.println(insertPoint.data);
        }





    }
}
