package CheckedExceptionExamples;
import java.io.*;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/invalid/directory/file.txt");
            writer.write("Hello");
            writer.close();
        } catch (IOException e) {
            System.out.println("We got an IO Exception");
            System.out.println("ROOT CAUSE: Cannot write to invalid directory path");
            System.out.println("os denied access or path doesn't exist");
        }
    }
}
