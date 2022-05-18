import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoCheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text.txt");
        FileReader fileReader = new FileReader(file);
    }
}
