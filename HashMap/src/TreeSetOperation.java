import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetOperation {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(34);
        ts.add(23);
        System.out.println(ts);

        Iterator it = ts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
