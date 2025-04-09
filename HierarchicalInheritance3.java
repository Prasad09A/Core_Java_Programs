package InheritanceBasicPrograms3;

class Base {
    void printA() {
        System.out.println("method1 test message");
    }

    void printB() {
        System.out.println("method2 test message");
    }

    void printC() {
        System.out.println("method3 test message");
    }
}

class Mid1 extends Base {}

class Mid2 extends Mid1 {}

class Bottom extends Mid2 {}

public class HierarchicalInheritance3 {
    public static void main(String[] args) {
        Bottom obj = new Bottom();
        obj.printA();
        obj.printB();
        obj.printC();
    }
}
