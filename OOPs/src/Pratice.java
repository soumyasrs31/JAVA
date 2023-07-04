public class Pratice {
    public static void main(String[] args) {
        Studentss s = new Studentss();
        Studentss s2 = new Studentss("soumya");
        Studentss s3 = new Studentss(23);
        Studentss s4 = new Studentss("soumya", 23);
        System.out.println(s2.name);
        System.out.println(s3.age);
        System.out.println(s4.name+s4.age);

    }
}
 class Studentss{
    static String name;
    static int age;
    Studentss(String name){
        this.name = name;
        System.out.println("parameterized constructor is called");
    }
    Studentss(int age){
        this.age = age;

    }
    Studentss(String name, int age){
        this.name = name;
        this.age = age;
    }
    Studentss(){
        System.out.println("non parameterized constructor");
    }

    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
}

class Pen{
    static String color;
    static int tip;
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}
