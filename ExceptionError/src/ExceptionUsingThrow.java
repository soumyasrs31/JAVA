public class ExceptionUsingThrow {
    static void checkAge(int age){
        if(age < 18 ){
            throw new ArithmeticException("not adult");
        }else{
            System.out.println("adult");
        }
    }
    public static void main(String[] args) {
        checkAge(18);
    }
}
