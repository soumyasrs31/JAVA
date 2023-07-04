public class DeleteNthNodeFromEnd {
    public static class Node{
        int data;
        SingleLinkedList.Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static SingleLinkedList.Node head;
    public static SingleLinkedList.Node tail;
    public static int size;

    public void addFirst(int data){
        SingleLinkedList.Node newNode = new SingleLinkedList.Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data){
        SingleLinkedList.Node newNode = new SingleLinkedList.Node(data);
        size++;
        if(head == null){
            head=tail= newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void atIndex(int data,int index){
        SingleLinkedList.Node newNode = new SingleLinkedList.Node(data);
        SingleLinkedList.Node ptr = head;
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
        SingleLinkedList.Node newNode = new SingleLinkedList.Node(data);
        size++;
        SingleLinkedList.Node ptr = head;
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
        SingleLinkedList.Node ptr = head;
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
        SingleLinkedList.Node ptr = head.next;
        SingleLinkedList.Node preptr = head;
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
        SingleLinkedList.Node ptr = head;
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
        SingleLinkedList.Node ptr = head;
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
        SingleLinkedList.Node prev = null;
        SingleLinkedList.Node curr = head;
        SingleLinkedList.Node next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //delete Nth Node from end

    public static void deleteNthNode(int position){
        if(position == 0){
            head = head.next;
            return;
        }
        int nth = size - position +1;//from beginning
        int i = 1;
       SingleLinkedList.Node ptr = head;
       while(i<nth-1){
           ptr= ptr.next;
           i++;
       }
       ptr.next = ptr.next.next;



    }

    public static void main(String[] args) {
        DeleteNthNodeFromEnd ll = new DeleteNthNodeFromEnd();
        ll.addFirst(2);
        ll.addLast(34);
        ll.addLast(8);
        ll.addFirst(4);
        ll.addLast(57);
        ll.display();
        ll.deleteNthNode(2);
        ll.display();

    }
}
