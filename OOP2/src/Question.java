/*public class Question {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print();
        Vehicle obj2 = new Vehicle();
        obj2.print();

        //note it is contain same method so it is function overriding . so due to this obj1 is reference of vehicle but object of car so due to function overriding first call to child class but in obj2 its reference is vehicle and object is also vehicle..
    }
}
class Vehicle{
    void print(){
        System.out.println("Base class");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("Derived class");
    }
}*/

/*
public class Question {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print1();//it gives error because obj1 only access to print method it is not access to print1 method..
        Vehicle obj2 = new Vehicle();
        obj2.print();


    }
}
class Vehicle{
    void print(){
        System.out.println("Base class");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.println("Derived class");
    }
}
*/
/*
public class Question {
    public static void main(String[] args) {
        System.out.println(Books.count);
        Books b1 = new Books(150);
        Books b2 = new Books(345);
        System.out.println(Books.count);
    }
}
class Books{
    int price;
    static int count;
    public Books(int price){
        this.price = price;
        count++;
    }
}*/

public class Question {
    public static void main(String[] args) {
        Test t = new Test();
        t.printVal();
        System.out.println(Test.a + Test.b);
    }
}
class Test{
    static int a = 10;
    static int b ;
    void printVal(){
        b = a*3;
    }
}