package Constructor;

class ConstructorParent{
    ConstructorParent(){
        System.out.println("This is default constructor of Parent class");
    }

}

public class ConstructorInheritance extends ConstructorParent{
    public static void main(String[] args) {
        ConstructorInheritance obj= new ConstructorInheritance();

    }
}
