package CheckedExceptionExamples;

import java.io.IOException;
import java.net.Socket;

public class SocketExceptionExample {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("whatsappap.com", 80);
            System.out.println("Connection successful");
        } catch (IOException e) {
            System.out.println("Cannot connect to server!");
            System.out.println("Exception occurred becuase whatsaapp.com doesn't exist");


        }}}