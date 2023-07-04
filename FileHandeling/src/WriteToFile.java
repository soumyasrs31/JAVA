import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter myWrite = new FileWriter("createfile.txt");
            myWrite.write("soumya is good guy. He is studying mca at outr");
            myWrite.close();
            System.out.println("file write is successfully");
        }catch(IOException e){
            System.out.println("something error occur");
            e.printStackTrace();
        }
    }
}
