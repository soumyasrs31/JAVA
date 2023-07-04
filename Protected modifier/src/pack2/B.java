package pack2;
import pack1.A;

public class B extends A{
    public static void main(String[] args) {
        A a = new A();
        //a.m1(); //due to protected access specifier we can not use parent class reference variable

        B b = new B();
        b.m1();  // here b is child class reference so it call the m1() function

        A a1 = new B();
        //a.m1();  //Here a1 is parent class reference and contain the child class object...it canot be call the function...

        
    }
}
