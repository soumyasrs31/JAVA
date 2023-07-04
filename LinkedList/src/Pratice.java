public class Pratice {
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

    public static boolean checkCycleLL(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node fast = head;
        Node slow = head;
        Node prev = null;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        slow = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;

    }

    public static void main(String[] args) {
        head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next = new Node(8);
        head.next.next.next = head;
        System.out.println(checkCycleLL());
         removeCycle();
        System.out.println(checkCycleLL());

    }
}
