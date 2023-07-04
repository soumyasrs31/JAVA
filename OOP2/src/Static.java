public class Static {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.schoolName = "vsk";
        System.out.println(s1.schoolName);
        System.out.println(s1.calculateCgpa(2,4,6));
        Student s2 = new Student();

        System.out.println(s2.schoolName);
        Student s3 = new Student();
        s3.schoolName = "kv";
        //now s1,s2,s3 school name is changed to kv ..
        System.out.println(s1.schoolName);
    }
}
class Student{
    //static is used for method
    static int calculateCgpa(int math, int english, int science){
        return (math+english+science)/3;
    }
    //static keyword used for property
    static String schoolName;
    String name;
    int rollNo;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

