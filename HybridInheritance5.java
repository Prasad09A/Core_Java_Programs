package InheritanceBasicPrograms2;

class Q {
    void methodQ() {
        System.out.println("Method of class Q");
    }
}

class R extends Q {
    void methodR() {
        System.out.println("Method of class R");
    }
}

class S extends Q {
    void methodS() {
        System.out.println("Method of class S");
    }
}

class T extends R {
    void methodT() {
        System.out.println("Method of class T");
    }
}

public class HybridInheritance5 {
    public static void main(String[] args) {
        T obj = new T();
        obj.methodQ();
        obj.methodR();
        obj.methodT();

        S obj2 = new S();
        obj2.methodQ();
        obj2.methodS();
    }
}
