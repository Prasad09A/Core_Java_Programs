package InheritanceBasicPrograms;

class ClassP {
    void temp() {
        System.out.println("Temp method from base class");
    }
}

public class SingleInheritance6 extends ClassP {
    public static void main(String[] args) {
        SingleInheritance6 obj = new SingleInheritance6();
        obj.temp();
    }

}
