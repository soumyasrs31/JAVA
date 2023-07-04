import java.io.File;

public class GetFileINFO {
    public static void main(String[] args) {
        File obj = new File("createfile.txt");
        if(obj.exists()){
            System.out.println(obj.getName());
            System.out.println(obj.getAbsolutePath());
            System.out.println(obj.canRead());
            System.out.println(obj.canWrite());
            System.out.println(obj.length());
        }else{
            System.out.println("the file doesnot exists");
        }
    }
}
