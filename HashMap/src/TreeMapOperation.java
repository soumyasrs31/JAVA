import java.util.TreeMap;
public class TreeMapOperation {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("US",50);
        tm.put("Indonesia",10);
        System.out.println(tm);
    }
}
