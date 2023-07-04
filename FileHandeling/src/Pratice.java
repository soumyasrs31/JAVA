import java.io.File;
import java.io.IOException;
public class Pratice {
    public static void main(String[] args) {
        try{
            File obj = new File("newfile.txt");
            if(obj.createNewFile()){
                System.out.println(obj.getName());

            }else{
                System.out.println("file is already exists");
            }
        }catch(IOException e){
            System.out.println("something error occur");
            e.printStackTrace();
        }
    }
}
