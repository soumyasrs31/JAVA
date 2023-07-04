

/*
public class OOP {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setThick(5);
        System.out.println(p1.thick);
        p1.color = "red";
        System.out.println(p1.color);

        BankAccount person = new BankAccount();
        person.username = "Soumya";
        //we donot set password for the user using its password property only we can be set password using methods..
       // person.password = "afdaf";
        person.setPassword("dasafa");
    }
}
class Pen{
    String color;
    int thick;
    void setColor(String newColor){
        color = newColor;
    }
    void setThick(int newThick){
        thick = newThick;
    }
}
    //Access modifier/ Access Specifier..
class BankAccount{
    public String username;
   private String password;
    public void setPassword(String psw){
        password = psw;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}*/

    /*//using of Getters and Setters . when we uses private access modifier uses in properties of classes then we uses getters and setters...
public class OOP {
    public static void main(String[] args) {
        Pen p1 = new Pen("white");
        System.out.println(p1.getColor());
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setThick(5);
        System.out.println(p1.getThick());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

    }
}
class Pen{
    private String color;
    private int thick;

    String getColor(){
        return this.color;
    }
    int getThick(){
        return this.thick;
    }
    void setColor(String color){
        this.color = color;
    }
    void setThick(int thick){
        this.thick = thick;
    }

    //constructor...
    Pen(String color){
        this.color = color;
        System.out.println("constructor is atFirst calling by class");
    }
}*/


    // types of constructors...

/*public class OOP{

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Soumya");
        Student s3 = new Student(23);
        //Student s4 = new Student("Soumya",23); this type of constructor arenot existed..
    }
}

class Student{
    String name;
    int age;

    Student(){
        System.out.println("This is non Parameterized constructor..");
    }

    Student(String name){
        this.name = name;
    }

    Student(int age){
        this.age = age;
    }
}*/



public class OOP{
    public static void main(String[] args) {
        students s1 = new students();
        s1.name = "soumya";
        s1.age = 24;
        s1.password = "gdfg";
        s1.mark[0] = 45;
        s1.mark[1] = 43;
        s1.mark[2] = 78;
        students s2 = new students();
        s2.password = "erqer";
        s1.mark[3] = 100;


            System.out.println(s2.name);
            for(int i=0; i<3; i++){
                System.out.println(s2.mark[i]);
            }


    }
}

class students{
    String name;
    int age;
    String password;
    int []mark;

    //Non parameterizied constructor..
    students(){
        this.name = name;
    }
    // parameterized constructor...

    students(int age){
      this.age = age;
    }

    //copy constructor..
    //shallow copy constructor..
    /*students(students s1){
        mark = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.mark = s1.mark;
    }*/

    /*//deep copy constructor...
    students(students s1){
        mark = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for(int i=0; i<3; i++){
            this.mark[i] = s1.mark[i];
        }
    }*/
}


