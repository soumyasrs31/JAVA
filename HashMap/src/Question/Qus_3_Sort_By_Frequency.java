package Question;

import java.util.HashMap;
import java.util.TreeMap;

public class Qus_3_Sort_By_Frequency {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String s = "cccaaaacded";
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
        for(Character i : map.keySet()){
            while(map.get(i) != 0){
                System.out.print(i);
                if(map.get(i)==0){
                    map.remove(i);
                }else{
                    map.put(i,map.get(i)-1);
                }
            }
        }
    }
}
