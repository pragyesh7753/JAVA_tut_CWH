
import java.io.*;

public class FileWriterExample {

    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("D:/output.txt");
            // inherited method from java.io.OutputStreamWriter
            writer.write(65);
            writer.write(66);
            writer.write(67);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.flush();
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}