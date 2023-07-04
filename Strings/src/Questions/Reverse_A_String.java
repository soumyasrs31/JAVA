package Questions;

public class Reverse_A_String {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
