import java.io.FileWriter;
import java.io.IOException;
public class praticeWrite {
    public static void main(String[] args) {
        try{
            FileWriter w = new FileWriter("newfile.txt");
            w.write("i am soumya sahoo . i have a job in mnc company");;
            w.close();
            System.out.println("write is successfull");
        }catch(IOException e){
            System.out.println("something error occur");
            e.printStackTrace();
        }
    }
}
