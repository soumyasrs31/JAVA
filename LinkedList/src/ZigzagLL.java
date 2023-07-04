public class ZigzagLL {
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



    public static void zigzag(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node midNode = slow;


        Node curr = midNode.next;
        midNode.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
       Node rh = prev;
       Node lh = head;
       Node nextl;
       Node nextr;

       while(rh!= null && lh != null){
           nextl = lh.next;
           lh.next = rh;
           nextr = rh.next;
           rh.next= nextl;

           lh = nextl;
           rh = nextr;
       }


    }
    public static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public static void main(String[] args) {
        ZigzagLL ll = new ZigzagLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.display();

        ll.zigzag();
        ll.display();
    }
}
