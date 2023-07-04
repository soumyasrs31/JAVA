package Questions;

//Write a Java code snippet to count the occurrences of a specific character in a string using StringBuilder.
public class Count_The_Occurance_Of_A_Letter {
    public static void main(String[] args) {
        String str = "Hello World";
        char charToCount = 'o';

        StringBuilder sb = new StringBuilder(str);
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == charToCount) {
                count++;
            }
        }

        System.out.println(count);

    }
}
