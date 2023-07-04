public class SingleLinkedList{
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
            head=tail= newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void atIndex(int data,int index){
        Node newNode = new Node(data);
        Node ptr = head;
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        int i = 0;
        while(i < index-1){
            ptr = ptr.next;
            if(ptr == null){
                System.out.println("Invalid index");

            }
            i++;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
    }

    public void afterNode(int data,int key){
        Node newNode = new Node(data);
        size++;
        Node ptr = head;
        if(head == null){
            head = tail= newNode;
            return;
        }
        while(ptr.data != key){
            ptr = ptr.next;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
    }

    public static int deleteAtFirst(){
        if(head == null){
            System.out.println("empty LL");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head= head.next;
        size--;
        return val;
    }

    public static int deleteAtLast(){
        if(head == null){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node ptr = head;
        while(ptr.next != tail){
            ptr = ptr.next;
        }
        int val = tail.data;
        ptr.next = null;
        tail = ptr;
        size--;
        return val;
    }
    public static int deleteAtIndex(int index){
        if(head == null){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        if(head.next == null){
            int val = head.data;
            head= tail= null;
            size = 0;
            return val;
        }
        Node ptr = head.next;
        Node preptr = head;
        int i=0;
        while(i < index-1){
            ptr = ptr.next;
            preptr = preptr.next;
            i++;
        }
        int val = ptr.data;
        preptr.next = ptr.next;
        size--;
        return val;

    }

    public void display(){
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

    public void search(int key){
        if(head == null){
            System.out.println("empty");
            return;
        }
        Node ptr = head;
        int i=0;
        while(ptr.data != key){
            ptr = ptr.next;
            if(ptr == null){
                System.out.println("not valid index");
                return;
            }
            i++;
        }
        System.out.println("index is"+ i);

    }

    public static void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //palindrome...

    public static Node findMid(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //find the mid..
        Node prev = null;
        Node curr = findMid(head);
        Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.addLast(3);
        sll.addLast(2);
        sll.addLast(2);
        sll.addLast(1);
        sll.display();
        System.out.println(checkPalindrome());



    }
}