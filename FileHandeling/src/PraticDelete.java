import java.io.File;
public class PraticDelete {
    public static void main(String[] args) {
        File f = new File("newfile.txt");
        if(f.delete()){
            System.out.println(f.getName());
        }else{
            System.out.println("file fails to delete");
        }
    }
}
