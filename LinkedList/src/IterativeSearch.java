public class IterativeSearch {
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
    //addFirst...
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail= newNode;
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
        tail = newNode;
    }
    public void printNumber(){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Iterative Search
    public static int iterativeSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
                temp = temp.next;
                i++;

        }
        return -1;
    }
    public static void main(String[] args) {
    IterativeSearch it = new IterativeSearch();
    it.addFirst(2);
    it.addFirst(1);
    it.addLast(3);
    it.addLast(4);
    it.addLast(5);
    it.printNumber();
        System.out.println(it.iterativeSearch(4));
        System.out.println(it.iterativeSearch(10));

    }
}
