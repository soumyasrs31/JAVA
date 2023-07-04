import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapOperation {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",150);
        lhm.put("America",50);
        lhm.put("China", 150);
        System.out.println(lhm);

        System.out.println(lhm.get("China"));

        System.out.println(lhm.containsKey("Indonesia"));

        lhm.remove("India");
        System.out.println(lhm);

        System.out.println(lhm.size());

        System.out.println(lhm.isEmpty());

        Set<String> keys = lhm.keySet();
        for(String k : keys){
            if(lhm.get(k) == 150){
                System.out.println("key = "+ k + " value = " + lhm.get(k));
            }
        }


    }
}
