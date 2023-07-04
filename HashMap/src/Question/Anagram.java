package Question;

import java.util.HashMap;
public class Anagram {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s = "race";
        String t = "care";
        boolean check = checkAnagram(map,s,t);
        System.out.println(check);

    }
    public static boolean checkAnagram(HashMap<Character,Integer> map, String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }

            } else {
                return false;
            }

        }
        if(map.isEmpty()){
            return true;
        }

      return false;
    }


}
