package InheritanceBasicPrograms;

class X {
    void message() {
        System.out.println("message method of parent class");
    }
}

public class SingleInheritance3 extends X {
    public static void main(String[] args) {
        SingleInheritance3 obj = new SingleInheritance3();
        obj.message();
    }
}
