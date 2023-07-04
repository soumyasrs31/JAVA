
public class RecursiveSearch {
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
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail =newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
        System.out.println();

    }
    public int recursiveWork(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = recursiveWork(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return recursiveWork(head,key);
    }
    public void reverseLinkedList(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        RecursiveSearch rs = new RecursiveSearch();
        rs.addFirst(2);
        rs.addFirst(1);
        rs.addLast(3);
        rs.addLast(4);
        rs.addLast(5);
        rs.print();
        System.out.println(rs.recursiveSearch(3));
        rs.reverseLinkedList();
        rs.print();
    }
}
