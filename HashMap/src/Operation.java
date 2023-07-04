import java.util.HashMap;
public class Operation {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        //put operation O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("America", 50);

        System.out.println(hm);

        //get operation O(1)
        System.out.println(hm.get("India"));
        int population = hm.get("America");
        System.out.println(population);


        //containsKey Operation O(1)
        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("Indonesia"));

        //remove Operation O(1)
        System.out.println(hm.remove("India"));
        System.out.println(hm);

        //Size Operation
        System.out.println(hm.size());

        //isEmpty()

        System.out.println(hm.isEmpty());
    }
}
