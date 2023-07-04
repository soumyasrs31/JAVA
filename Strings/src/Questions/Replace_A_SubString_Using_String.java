package Questions;

// Write a Java code snippet to replace all occurrences of a substring within a string using StringBuilder.
public class Replace_A_SubString_Using_String {
    public static void main(String[] args) {
        String str = "Hello World, Hello Universe";
        String substringToReplace = "Hello";
        String replacement = "Hi";

        StringBuilder sb = new StringBuilder(str);
        int index = sb.indexOf(substringToReplace);
        while (index != -1) {
            sb.replace(index, index + substringToReplace.length(), replacement);
            index = sb.indexOf(substringToReplace, index + replacement.length());
        }

        String result = sb.toString();
        System.out.println(result);

    }
}
