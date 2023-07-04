public class Replace0_5 {
    public static int reverse(int temp){
        int reverseNum = 0;
        while(temp>0){
            int digit = temp%10;
            reverseNum = reverseNum *10 + digit;
            temp = temp/10;
        }
        return reverseNum;
    }
    public static int replace0_5(int n){
        if(n==0){
            return 5;
        }
        int temp = 0;
        while(n>0){
            int digit = n%10;
            if(digit == 0){
                digit = 5;
            }
            temp = temp*10 + digit;
            n = n/10;
        }
        return reverse(temp);
    }
    public static void main(String[] args) {
        int num = 100305;

        System.out.println(replace0_5(num));
    }
}
