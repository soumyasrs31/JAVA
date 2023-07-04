public class SubArray_String {
    public static void subArray(String str, int i, String ans){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        subArray(str,i+1,ans+str.charAt(i)); //yes
        subArray(str,i+1,ans); //No
    }
    public static void main(String[] args) {
        String str = "abc";
        subArray(str,0,"");
    }
}
