import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {

    private String fileName;
    public FilePrinter(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void print(String s) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(s);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
