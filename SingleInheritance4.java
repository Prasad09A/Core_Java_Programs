package InheritanceBasicPrograms;

class Base {
    void display() {
        System.out.println("Display method of Base class");
    }
}

public class SingleInheritance4 extends Base {
    public static void main(String[] args) {
        SingleInheritance4 obj = new SingleInheritance4();
        obj.display();
    }
}

