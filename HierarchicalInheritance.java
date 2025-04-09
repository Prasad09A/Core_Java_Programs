package InheritanceBasicPrograms3;

class ParentHierarchical{
    void method1(){
        System.out.println("method1 test message");
    };
    void method2(){
        System.out.println("method2 test message");
    };
    void method3(){
        System.out.println("method3 test message");
    };
}

class ChildHierarchical extends ParentHierarchical{

}
class ChildHierarchical2 extends ChildHierarchical{

}
class ChildHierarchical3 extends ChildHierarchical2{

}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        ChildHierarchical3 obj=new ChildHierarchical3();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}
