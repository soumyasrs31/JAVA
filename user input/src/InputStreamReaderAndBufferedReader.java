import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InputStreamReaderAndBufferedReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String message = bufferedReader.readLine();
        System.out.println("message is "+message);
    }
}
