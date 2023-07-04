import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetOperation {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Bhubaneswar");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Chennai");

        System.out.println(cities);

        if(cities.contains("Noida")){
            System.out.println("it contain");
        }

        //Iterate..

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
