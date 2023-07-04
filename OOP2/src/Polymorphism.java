import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Polymorphism {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

// Method Overload...
/*
class Calculator{

    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum (int a, int b, int c){
        return a+b+c;
    }
}*/

//Method overriding...
class Animal{
    void eat(){
        System.out.println("eat Anything");
    }
}
class Deer extends Animal{
    @Override
    void eat() {
        System.out.println("eat grass");
    }
}