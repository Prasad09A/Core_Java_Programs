package InheritanceBasicPrograms2;

// Base class
class A {
    void methodA() {
        System.out.println("Class A method");
    }
}

// Class B inherits from A
class B extends A {
    void methodB() {
        System.out.println("Class B method");
    }
}

// Class C also inherits from A
class C extends A {
    void methodC() {
        System.out.println("Class C method");
    }
}

// Class D inherits from B
class D extends B {
    void methodD() {
        System.out.println("Class D method");
    }
}

public class HybridInheritance1 {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA();
        obj.methodB();
        obj.methodD();

        C obj2 = new C();
        obj2.methodA();
        obj2.methodC();
    }
}