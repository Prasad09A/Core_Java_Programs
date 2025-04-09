package InheritanceBasicPrograms;

class GrandParents{
    void method1(){
        System.out.println("method1() if GrandParent class");
    }
}
class ParentClass extends GrandParents {
    void method2(){
        System.out.println("method2() if ParentClass class");
    }
}

public class MultiLevelInheritance1 extends ParentClass {
    void method3() {
        System.out.println("method4() if MultiLevelInheritance1 class");
    }

    public static void main(String[] args) {
        MultiLevelInheritance1 obj= new MultiLevelInheritance1();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
