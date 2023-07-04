import java.util.*;
import java.util.Arrays;
public class Strings{
    /*public static void main(String[] args) {
        //in string, we can define in two way there are...

        String str = "abcd";
        String str2 = new String("abcd");
        // JAVA STRING IS IMMUTABLE...

        Scanner sc = new Scanner(System.in);
        String str3 = sc.next();
        String str4 = sc.nextLine();

       /* //string length..
        String fullName = "Soumya Ranjan Sahoo";
        System.out.println(fullName.length());*/

        /*//concatenation..
        String firstName = "soumya";
        String lastName = "Sahoo";
        String fullName = firstName +" " + lastName;
        System.out.println(fullName);*/

        /*//CharAt ....
        String fullName = "soumya";
        System.out.println(fullName.charAt(2));


    }*/

    /*//check if a string is palindrome..

    public static boolean palindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        if(palindrome(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }*/


    /*//find the shortest path to reach the destination "wneenesennn"..
    public static float shortestPath(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){
            int dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }else if(dir == 'E'){
                x++;
            }else if(dir == 'S'){
                y--;
            }else{
                x--;
            }

        }
        int x2 = (x-0)*(x-0);
        int y2 = (y-0)*(y-0);
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortestPath(path));
    }*/

    /*//substring function...
    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }

        return substr;
    }

    public static void main(String[] args) {
        //String compare...
        String str = "soumya";
        String str2 = new String("soumya");

        //This is not the right way to compare two string...
        *//*if(str == str2){
            System.out.println("equal");

        }else{
            System.out.println("NOt Equal");
        }*//*

        //for comparing two string we uses "equals" function..

        *//*if(str.equals(str2)){
            System.out.println("Equal");
        }else{
            System.out.println("NOt Equal");
        }*//*

        //substring function..

        //System.out.println(str.substring(0,4));

        //build function create for substring of a string...

        System.out.println(subString(str, 0, 4));

    }*/
/*
    //how to find largest string..

    public static void main(String[] args) {
        String arr[] = {"apple", "banana", "orange"};
        String largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(largest.compareTo(arr[i]) < 0){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }*/

    /*//String Builder...

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }*/

    /*//for a given string convert each the first letter of each word to uppercase...

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(' ');
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am a soumya";
        System.out.println(toUpperCase(str));
    }*/

   /* //String compression...
    public static String stringCompression(String str){
        String compString = "";

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){

                i++;
                count++;
            }
            compString += str.charAt(i);
            if(count > 1){
                compString += count.toString();
            }else{
               compString += str.charAt(i);
            }
        }
        return compString;
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(stringCompression(str));
    }*/

/*// StringBuffer...
public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("soumya ");
    sb.append("Arup");
    System.out.println(sb);
    //output is soumya arup..
    // this cam be changed the orginal string...
}*/
    /*//intern() method uses...
    //output is equal..
    public static void main(String[] args) {
        String str = new String("soumya").intern();
        String str2 = new String("soumya").intern();
        if(str == str2){
            System.out.println("equal");
        }else{
            System.out.println("Not equal");
        }
    }*/


   /* //Count how many times lower case vowels occurred in a String entered by the user.
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }*/

    /*// replace method..

    public static void main(String[] args) {
        String str = "SoumyaSahoo".replace("Soumya", "Arup");
        System.out.println(str);
    }*/

    //check the two strings are anagram to each other...

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        str1.toLowerCase();
        str2.toLowerCase();
        if(str1.length() == str2.length()){
            char charArraystr1[] = str1.toCharArray();
            char charArraystr2[] = str2.toCharArray();

            Arrays.sort(charArraystr1);
            Arrays.sort(charArraystr2);

            boolean result = Arrays.equals(charArraystr1,charArraystr2);
            if(result){
                System.out.println("this is anagram");
            }else{
                System.out.println("this isnot anagram");
            }
        }else{
            System.out.println("this isnott anagram");

        }

    }


}





