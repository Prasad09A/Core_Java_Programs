package InheritanceBasicPrograms3;

class Root {
    void m1() {
        System.out.println("method1 test message");
    }

    void m2() {
        System.out.println("method2 test message");
    }

    void m3() {
        System.out.println("method3 test message");
    }
}

class Branch1 extends Root {}

class Branch2 extends Branch1 {}

class Leaf extends Branch2 {}

public class HierarchicalInheritance5 {
    public static void main(String[] args) {
        Leaf obj = new Leaf();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
