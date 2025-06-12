package StringPrograms;

public class ByteArrayFromString {
    public static void main(String[] args) {

        String str="Prasad";

        byte[] by= str.getBytes();

        String result= new String(by);

        System.out.println(result);
    }
}
