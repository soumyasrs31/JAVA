package Questions;

//Write a Java code snippet to split a string into an array of substrings using the split() method of String.
public class Create_Substrings_Array_Using_Split_Method {
    public static void main(String[] args) {
        String str = "Hello,World,Soumya,pari";
        String []subStrings = str.split(",");
        for(String i : subStrings){
            System.out.println(i);
        }

    }
}
