public class MergeSortLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node midNode(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;

        }
        Node midNode = midNode(head);
        Node rightHead = midNode.next;
        midNode.next = null;
        Node leftHead = head;

        Node newLeftHead = mergeSort(leftHead);
        Node newRightHead = mergeSort(rightHead);
        return merge(newLeftHead, newRightHead);
    }
    public static void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
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
        MergeSortLL ll = new MergeSortLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.mergeSort(ll.head);
        ll.display();
    }
}
