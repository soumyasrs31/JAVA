public class DoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        newNode.prev = null;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = newNode;
        newNode.next= null;
        newNode.prev = ptr;
    }

    public static void addAfterData(int data, int key){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        Node ptr = head;
        while(ptr.data != key){
            ptr = ptr.next;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
        newNode.prev = ptr;
        newNode.next.prev = newNode;
    }
    public static int removeAtFirst(){
        if(head == null){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head = null;
            size = 0;
            return val;
        }
        Node ptr = head.next;
        int val = head.data;
        ptr.prev = null;
        head = ptr;
        size--;
        return val;
    }

    public static int removeAtLast(){
        if(head == null){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head = null;
            size = 0;
            return val;
        }
        Node ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        int val = ptr.next.data;
        ptr.next = null;
        tail = ptr;
        size--;
        return val;
    }

    public static int removeAtIndex(int index){
        if(head == null){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head = null;
            size= 0;
            return val;
        }
        Node ptr = head.next;
        Node prePtr = head;
        int i = 0;
        while(i<index-1){
            ptr = ptr.next;
            prePtr = prePtr.next;
            i++;
        }
        int val = ptr.data;
        prePtr.next = ptr.next;
        ptr.next.prev = prePtr;
        size--;
        return val;

    }

    public static void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void display(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLL ll = new DoubleLL();
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addLast(6);
        ll.addAfterData(8,4);
        ll.display();
        ll.reverse();
        ll.display();
    }
}
