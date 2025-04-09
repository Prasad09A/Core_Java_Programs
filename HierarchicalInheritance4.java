package InheritanceBasicPrograms3;

class Base1 {
    void printA() {
        System.out.println("Base - printA");
    }

    void printB() {
        System.out.println("Base - printB");
    }

    void printC() {
        System.out.println("Base - printC");
    }
}

class Mild1 extends Base1 {}

class Mild2 extends Mild1 {}

class Bottom1 extends Mild2 {}

public class HierarchicalInheritance4 {
    public static void main(String[] args) {
        Bottom1 obj = new Bottom1();
        obj.printA();
        obj.printB();
        obj.printC();
    }
}
