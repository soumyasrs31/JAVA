import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ReadFile {
    public static void main(String[] args) {
       try{
           File read = new File("createfile.txt");
           Scanner sc = new Scanner(read);
           while(sc.hasNextLine()){
               String data = sc.nextLine();
               System.out.println(data);
           }
       }catch(FileNotFoundException e){
           System.out.println("something error occur");
           e.printStackTrace();
       }
    }
}
