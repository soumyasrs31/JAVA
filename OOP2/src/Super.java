import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Super {
    public static void main(String[] args) {

        Dogs a = new Dogs();
        System.out.println(a.color);
    }
}
class Animal2{
    String color;
    Animal2(){
        System.out.println("Animal constructor is called");
    }
}

class Dogs extends Animal2{
    Dogs(){
      super.color = "brown";
        System.out.println("Dogs constructor is called");
    }
}
