package InheritanceBasicPrograms;

class Parent2 {
    void post() {
        System.out.println("post method from base class");
    }
}

public class SingleInheritance10 extends Parent2 {
    public static void main(String[] args) {
        SingleInheritance10 obj = new SingleInheritance10();
        obj.post();
    }
}
