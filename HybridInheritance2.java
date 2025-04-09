package InheritanceBasicPrograms2;

class X {
    void methodX() {
        System.out.println("Class X method");
    }
}

class Y extends X {
    void methodY() {
        System.out.println("Class Y method");
    }
}

class Z extends X {
    void methodZ() {
        System.out.println("Class Z method");
    }
}

class W extends Y {
    void methodW() {
        System.out.println("Class W method");
    }
}

public class HybridInheritance2 {
    public static void main(String[] args) {
        W obj = new W();
        obj.methodX();
        obj.methodY();
        obj.methodW();

        Z obj2 = new Z();
        obj2.methodX();
        obj2.methodZ();
    }
}
