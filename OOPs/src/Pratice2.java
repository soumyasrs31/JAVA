public class Pratice2 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.eat();
        d.legs = 4;
        d.barks();
        System.out.println(d.legs);
    }
}
 class Animals{
    static int color;
    void eat(){
        System.out.println("all animals are eaten");
    }
    void breathe(){
        System.out.println("all animals are breathe");
    }
    Animals(){
        System.out.println("animals constructor");
    }
}

class Mammals extends Animals{
    int legs;
    void legs(int legs){
        this.legs = legs;
        System.out.println("running");
    }

}

class Dogs extends Mammals{
    void barks(){
        System.out.println("barking");
    }
}
class Duck extends Dogs{
    void barks(){
        System.out.println("sdfs");
    }
}
