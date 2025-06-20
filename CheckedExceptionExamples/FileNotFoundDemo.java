package CheckedExceptionExamples;
import java.io.*;

public class FileNotFoundDemo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("abc.txt");
            System.out.println("File opened successfully");
        } catch (FileNotFoundException e) {
            System.out.println("We got an file not found exception");
            System.out.println("ROOT CAUSE: File doesn't exist at specified path");
            System.out.println("The System not able to find the file");
                }
            }
        }


