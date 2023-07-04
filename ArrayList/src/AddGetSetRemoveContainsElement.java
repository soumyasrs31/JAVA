import java.util.ArrayList;
public class AddGetSetRemoveContainsElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //TC of adding element in arraylist is O(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //Add element in middle of the arraylist
        list.add(2,10);
        System.out.println(list);
        //Get Element
        System.out.println(list.get(2));

        //set element
        list.set(2,9);
        System.out.println(list);

        //Delete element
        list.remove(2);

        System.out.println(list);

        //contains element (boolean)
        System.out.println(list.contains(3) +" "+ list.contains(9));
    }
}
