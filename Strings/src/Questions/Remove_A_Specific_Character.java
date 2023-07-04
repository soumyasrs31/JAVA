package Questions;

//Write a Java code snippet to remove all occurrences of a specific character from a string using StringBuilder.
public class Remove_A_Specific_Character {
    public static void main(String[] args) {
        String str = "Hello World";
        char removeChar = 'o';
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c != removeChar){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
