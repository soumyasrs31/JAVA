public class Oop {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.color);

    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animals constructor called");
    }
}

class Dog extends Animal{

    Dog(){
        super.color = "brown";
        System.out.println("dog constructor called");
    }
}