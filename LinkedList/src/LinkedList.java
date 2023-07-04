public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst ....
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //addLast...
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LinkedList is null");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-> ");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx, int data){
        Node newNode = new Node(data);
        size++;
        if(idx == 0){
            addFirst(data);
        }
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public static int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addFirst(1);
    ll.print();
    ll.addLast(3);
    ll.print();
    ll.addLast(4);
    ll.print();
    ll.add(2,9);
    ll.print();
    System.out.println(ll.size);//constant time required for counting size for the help of static keyword
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
    }
}
