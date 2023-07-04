import java.util.*;
public class ContainerWithMostWater {
    public static int mostWater(ArrayList<Integer> list){
        int maxWater = 0;
        //Brute force..
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                int minHeight = Math.min(list.get(i),list.get(j));
                int width = j-i;
                int currVol = minHeight * width;
                maxWater = Math.max(currVol,maxWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(mostWater(list));
    }
}
