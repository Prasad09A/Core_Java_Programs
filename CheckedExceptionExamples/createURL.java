package CheckedExceptionExamples;

import java.net.MalformedURLException;
import java.net.URL;

public class createURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("wrong-url");
        } catch (MalformedURLException e) {
            System.out.println("Bad URL format");
            System.out.println("Exception occurred because URL format is not correct");
        }
    }
    }
