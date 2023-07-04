import java.util.LinkedList;
import java.util.LinkedList;
public class LLInJavaCollectionFramework {
    public static void main(String[] args) {
       LinkedList<Integer> ll = new LinkedList<>();
       ll.addLast(2);
       ll.addFirst(1);
       ll.addFirst(0);
       ll.addLast(3);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}
