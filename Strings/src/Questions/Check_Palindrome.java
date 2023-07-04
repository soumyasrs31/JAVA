package Questions;

public class Check_Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        StringBuilder sb = new StringBuilder(str);
        String str2 = sb.reverse().toString();
        if(str.equals(str2)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
