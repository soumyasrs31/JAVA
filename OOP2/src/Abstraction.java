public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();

        //we donot create object using abstract class but we create constructor using abstract class..
        // ex= Animal a = new Animal();

        //Hierarchical constructor call

        Mustang m = new Mustang();

    }
}

abstract class Animal1{
    String color;
    //constructor
    Animal1(){
        System.out.println("Animal Constructor");
    }

    void eat(){
        System.out.println("Animal Eatsz");

    }

    // abstract method only gives idea to child class...
    abstract void walk();
}

class Horse extends Animal1 {


    Horse() {
        System.out.println("Horse Constructor");
    }
    // child class are implements the abstract method..

    void walk() {
        System.out.println("horse is running using 4 legs");
    }
}
    class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor");
    }
    }
    class Chicken extends Animal1{

        void walk(){
            System.out.println("walk in 2 legs");
        }
    }
