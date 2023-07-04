import java.util.*;
public class CalculateCircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        c.setRadius(sc.nextDouble());
        System.out.println("Area is"+c.area());
        System.out.println("Perimeter is"+ c.perimeter());
    }
}
class Circle{
    double radius;
    void setRadius(double radius){
        this.radius = radius;
    }
    double perimeter(){
        return 2*radius*Math.PI;
    }
    double area(){
        return Math.PI*radius*radius;
    }
}
