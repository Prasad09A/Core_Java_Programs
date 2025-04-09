package InheritanceBasicPrograms;

class ClassF {
    void half() {
        System.out.println("half method from base class");
    }
}

public class SingleInheritance9 extends ClassF {
    public static void main(String[] args) {
        SingleInheritance9 obj = new SingleInheritance9();
        obj.half();
    }
}
