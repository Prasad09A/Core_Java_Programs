package InheritanceBasicPrograms2;

class I {
    void methodI() {
        System.out.println("Method of class I");
    }
}

class J extends I {
    void methodJ() {
        System.out.println("Method of class J");
    }
}

class K extends I {
    void methodK() {
        System.out.println("Method of class K");
    }
}

class L extends J {
    void methodL() {
        System.out.println("Method of class L");
    }
}

public class HybridInheritance3 {
    public static void main(String[] args) {
        L obj = new L();
        obj.methodI();
        obj.methodJ();
        obj.methodL();

        K obj2 = new K();
        obj2.methodI();
        obj2.methodK();
    }
}
