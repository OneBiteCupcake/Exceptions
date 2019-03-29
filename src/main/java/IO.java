import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IO {
    public FileInputStream testMethod1() {
        File file = new File("test.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream.read();
        } catch (IOException e) {
            System.out.println("file not available. try again.");
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileInputStream;
    }

    public static void main(String[] args) {
        IO instance1 = new IO();
        instance1.testMethod1();
    }
}