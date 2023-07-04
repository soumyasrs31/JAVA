import java.io.File;
public class DeleteAFile {
    public static void main(String[] args) {
        //here text file is only delete not the whole file for full file delete we require full path of the file...
        File obj = new File("createfile.txt");
        if(obj.delete()){
            System.out.println(obj.getName());
        }else{
            System.out.println("file fails to delete");
        }
    }
}
