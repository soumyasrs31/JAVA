import java.util.HashSet;
import java.util.Iterator;

public class Union_And_Intersection_Problem {
    public static void main(String[] args) {
        int arr1[] = {1,3,4,5,6,2};
        int arr2[] = {1,5,7,9,5,1};

        HashSet<Integer> hs = new HashSet<>();
        // Union
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            hs.add(arr2[i]);
        }
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+", ");
        }

        //Intersection

        hs.clear();
        System.out.println();
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(hs.contains(arr2[i])){
                count++;
                System.out.print(arr2[i] +" ");
                hs.remove(arr2[i]);
            }
        }
        System.out.println();
        System.out.println("Total number of intersection is "+count);
    }
}
