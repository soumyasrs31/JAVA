public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 9;
        int binaryNum = 0;
        int i =0;
        while(num != 0){
            int rem = num%2;
            binaryNum += rem * Math.pow(10,i);
            num = num/2;
            i++;
        }
        System.out.println(binaryNum);
    }
}
