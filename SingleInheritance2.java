package InheritanceBasicPrograms;

class K {
    void show() {
        System.out.println("Test method of parent class");
    }
}

public class SingleInheritance2 extends K {
    public static void main(String[] args) {
        SingleInheritance2 obj = new SingleInheritance2();
        obj.show();
    }
}

