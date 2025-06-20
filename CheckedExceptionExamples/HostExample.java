package CheckedExceptionExamples;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostExample {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("whatsaapp.com");
            System.out.println("Host found: " + ip);
        } catch (UnknownHostException e) {
            System.out.println("Host not found");
            System.out.println("Exception occurred because whatsapp.com is not a original website");
        }

    }
}
