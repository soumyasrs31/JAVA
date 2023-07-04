import java.util.Comparator;  // Comparator interface
import java.util.PriorityQueue;

public class PriorityQueues_Sorted {
    public static void main(String[] args) {
        PriorityQueue<Integer> pt = new PriorityQueue<>(Comparator.reverseOrder());
        //by default ascending order is sorted - new PriorityQueue<>();
        // with interface comparator we can sorted in descending order - new PriorityQueue<>(Comparator.reverseOrder())
        pt.add(2); //O(logn)
        pt.add(5);
        pt.add(7);
        pt.add(3);
        pt.add(4);
        pt.add(3);

        while(!pt.isEmpty()){
            System.out.print(pt.peek()+" ");
            pt.remove();
        }
        System.out.println();




    }
}
