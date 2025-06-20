package CheckedExceptionExamples;

public class GetMethodExample {
    public static void main(String[] args) {
        try {
            Class c = String.class;
            c.getMethod("xyz"); // Method "xyz" doesn't exist in String class
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found!");
            System.out.println("Exception occurred because method xyz does not exist in String class");
        }
    }
    }

