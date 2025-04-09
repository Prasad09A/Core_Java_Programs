package InheritanceBasicPrograms;

class ClassD {
    void full() {
        System.out.println("full method from base class");
    }
}

public class SingleInheritance8 extends ClassD {
    public static void main(String[] args) {
        SingleInheritance8 obj = new SingleInheritance8();
        obj.full();
    }
}
