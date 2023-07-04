import java.util.HashSet;
import java.util.*;
public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        //add Operation O(1)

        hs.add(1);
        hs.add(4);
        hs.add(2);
        hs.add(2);

        /*System.out.println(hs);

        //remove O(1)
        hs.remove(2);
        System.out.println(hs);

        //contains O(1)
        System.out.println(hs.contains(2));

        //size
        System.out.println(hs.size());

        //clear()

        System.out.println(hs);
        //hs.clear();

        //isEmpty()

        System.out.println(hs.isEmpty());*/

        //Iterate-I Process

        for(Integer i : hs){
            System.out.println(i);
        }

        //Iterate-II Process

        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
