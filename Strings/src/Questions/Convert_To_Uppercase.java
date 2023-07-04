package Questions;

//Write a Java code snippet to convert a string to uppercase using StringBuilder.
public class Convert_To_Uppercase {
    public static void main(String[] args) {
        String str = "hellO";
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length(); i++){
            char c = sb.charAt(i);
            if(Character.isLowerCase(c)){
                sb.setCharAt(i,Character.toUpperCase(c));
            }else{
                sb.setCharAt(i,c);
            }
        }
        //System.out.println(str.toUpperCase());
        System.out.println(sb.toString());
    }
}
