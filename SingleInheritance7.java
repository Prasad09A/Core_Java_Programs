package InheritanceBasicPrograms;

class ClassZ {
    void Main() {
        System.out.println("Main method from base class");
    }
}

public class SingleInheritance7 extends ClassZ {
    public static void main(String[] args) {
        SingleInheritance7 obj = new SingleInheritance7();
        obj.Main();
    }
}

