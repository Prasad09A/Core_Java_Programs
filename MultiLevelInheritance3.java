package InheritanceBasicPrograms;

class S {
    void displayA() {
        System.out.println("Display from class A");
    }
}

class T extends S {
    void displayB() {
        System.out.println("Display from class B");
    }
}

public class MultiLevelInheritance3 extends T {
    void displayC() {
        System.out.println("Display from MultiLevelInheritance3 class");
    }

    public static void main(String[] args) {
        MultiLevelInheritance3 obj = new MultiLevelInheritance3();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}

