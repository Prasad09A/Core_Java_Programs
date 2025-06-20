package CheckedExceptionExamples;

import java.io.FileWriter;
import java.io.IOException;

public class PrintWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello");
            fw.close();
        } catch (IOException e) {
            System.out.println("Caught IOException while writing file ");
            System.out.println("Exception occurred because The file cannot be created or accessed.");
}
}
}
