import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
        File myObj = new File("createfile.txt");

            if(myObj.createNewFile()){
                System.out.println(myObj.getName());
            }else{
                System.out.println("file is already exists");
            }
        }catch(IOException e){
            System.out.println("something error occur");
            e.printStackTrace();
        }
    }
}
