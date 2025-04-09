package InheritanceBasicPrograms;

class P {
    void displayA() {
        System.out.println("Display from class A");
    }
}

class Q extends P {
    void displayB() {
        System.out.println("Display from class B");
    }
}

public class MultiLevelInheritance4 extends Q {
    void displayC() {
        System.out.println("Display from MultiLevelInheritance4 class");
    }

    public static void main(String[] args) {
        MultiLevelInheritance4 obj = new MultiLevelInheritance4();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}
