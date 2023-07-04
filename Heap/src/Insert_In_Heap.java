import java.util.ArrayList;
import java.util.List;

// min Heap
public class Insert_In_Heap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int x = arr.size()-1; //index of child
            int parent = (x-1)/2;
            while(arr.get(x) < arr.get(parent)){

                int temp = arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent,temp);
            }
        }

    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);
        int i=0;
        while(i < h.arr.size()){
            System.out.println(h.arr.get(i));
            i++;
        }
    }
}
