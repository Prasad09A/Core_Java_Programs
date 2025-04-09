package InheritanceBasicPrograms2;

class M {
    void methodM() {
        System.out.println("Method of class M");
    }
}

class N extends M {
    void methodN() {
        System.out.println("Method of class N");
    }
}

class O extends M {
    void methodO() {
        System.out.println("Method of class O");
    }
}

class P extends N {
    void methodP() {
        System.out.println("Method of class P");
    }
}

public class HybridInheritance4 {
    public static void main(String[] args) {
        P obj = new P();
        obj.methodM();
        obj.methodN();
        obj.methodP();

        O obj2 = new O();
        obj2.methodM();
        obj2.methodO();
    }
}