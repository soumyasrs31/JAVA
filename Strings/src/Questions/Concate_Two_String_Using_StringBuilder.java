package Questions;

public class Concate_Two_String_Using_StringBuilder {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2);
        String result = sb.toString();
        System.out.println(result);
    }
}
