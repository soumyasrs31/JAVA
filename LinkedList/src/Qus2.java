public class Qus2 {
    //all even numbers appear before all the odd numbers

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

    public static Node evenOddLL(){
        Node newNode = new Node(-1);
        Node newNode2 = new Node(-1);
        Node ptr = newNode;
        Node ptr2 = newNode2;
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                ptr.next = temp;
                ptr = ptr.next;
            }else{
                ptr2.next = temp;
                ptr2 = ptr2.next;
            }
            temp =temp.next;
        }
        ptr.next = newNode2.next;
        return newNode.next;
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
    public void display(Node head){
        Node ptr = head;
        if(head == null){
            System.out.println("Empty LL");
            return;
        }
        while(ptr != null){
            System.out.print(ptr.data+" -> ");
            ptr = ptr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        Qus2 ll = new Qus2();
        ll.addLast(2);
        ll.addLast(6);
        ll.addLast(3);
        ll.addLast(8);
        ll.addLast(9);
        ll.display(head);
        Node head1 = ll.evenOddLL();
        ll.display(head1);
    }


}
