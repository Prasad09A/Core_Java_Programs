package InheritanceBasicPrograms;

class A {
    void displayA() {
        System.out.println("Display from class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("Display from class B");
    }
}

public class MultilevelInheritance2 extends B {
    void displayC() {
        System.out.println("Display from MultiLevelInheritance2 class");
    }

    public static void main(String[] args) {
        MultilevelInheritance2 obj = new MultilevelInheritance2();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}

