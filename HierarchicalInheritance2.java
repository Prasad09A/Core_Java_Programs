package InheritanceBasicPrograms3;

class P {
    void display1() {
        System.out.println("method1 test message");
    }

    void display2() {
        System.out.println("method2 test message");
    }

    void display3() {
        System.out.println("method3 test message");
    }
}

class Q extends P {}

class R extends Q {}

class S extends R {}

public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        S obj = new S();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
