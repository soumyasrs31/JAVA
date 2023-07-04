public class CopyConstructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "soumya";
        s1.age = 23;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 200;
        s1.marks[2] = 300;
        Students s2 = new Students(s1);
        s2.password = "xyz";
        System.out.println(s2.name);
        System.out.println(s2.password);
        for(int i=0; i<s2.marks.length; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Students{
    static String name;
    static int age;
    static String password;
    int marks[];
    Students(Students s1){
         marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;
    }
    Students(String name){
         marks = new int[3];
        this.name = name;
    }
    Students(){
        marks = new int[3];
        System.out.println("non parametrized constructor");
    }
}