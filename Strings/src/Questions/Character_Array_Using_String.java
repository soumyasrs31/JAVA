package Questions;

public class Character_Array_Using_String {
    public static void main(String[] args) {
        String str = "Hello";

       // char[] charArray = str.toCharArray();
        for (char c : str.toCharArray()){
            System.out.println(c);
        }
    }
}
