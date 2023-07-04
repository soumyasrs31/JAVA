import java.util.HashMap;
import java.util.Set;

public class Iterate {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("America",50);
        hm.put("Srilanka", 10);

        Set<String> keys = hm.keySet();
        //prints all the keys
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key = "+k+", value = "+hm.get(k));
        }
    }
}
