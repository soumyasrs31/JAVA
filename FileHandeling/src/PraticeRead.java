import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class PraticeRead {
    public static void main(String[] args) {
        try{
            File f = new File("newfile.txt" );
            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                String data = s.nextLine();
                System.out.println(data);
            }

        }catch(FileNotFoundException e){
            System.out.println("something error occur");
            e.printStackTrace();
        }
    }
}
