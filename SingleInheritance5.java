package InheritanceBasicPrograms;

class SuperClass {
    void Display2() {
        System.out.println("Display2 method of Base class");
    }
}

public class SingleInheritance5 extends SuperClass {
    public static void main(String[] args) {
        SingleInheritance5 obj = new SingleInheritance5();
        obj.Display2();
    }
}
