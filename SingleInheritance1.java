package InheritanceBasicPrograms;

class Parent{
    void test(){
        System.out.println("Test method of parent class");
    }
}
public class SingleInheritance1 extends Parent {
    public static void main(String[] args) {
        SingleInheritance1 obj = new SingleInheritance1();
        obj.test();
    }

}
