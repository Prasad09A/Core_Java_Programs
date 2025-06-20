package CheckedExceptionExamples;

public class ClassNotFoundTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.nonexistent.MyClass");
        } catch (ClassNotFoundException e) {
            System.out.println("We got a Class Not Found exception");
            System.out.println("ROOT CAUSE: cannot find specified class in classpath");
            System.out.println("Exception occurs because class file is missing ");
        }
    }
}
