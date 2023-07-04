public class Inheritance {
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.color = "black";
        puppy.eat();
        System.out.println(puppy.color);
    }
}
class Animals{
    String color;

    void eat(){
        System.out.println("Eats");

    }
    void breath(){
        System.out.println("Breaths");
    }
}
// single level inheritance...
/*class Fish extends Animals{
    String name;

    void swim(){
        System.out.println("fish is swimming");
    }

}*/
// Multi level inheritance...
class Mammal extends Animals{
    String legs;

}
class Dog extends Mammal{
    void bark(){
        System.out.println("barks");
    }
}
