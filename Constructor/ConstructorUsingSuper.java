package Constructor;

class SuperClass{
    SuperClass(){
        System.out.println("This is no arg constructor of parent class");
    }

    SuperClass(int a, String b){
        System.out.println("This is 2 arg parametrized constructor");
    }
}

public class ConstructorUsingSuper extends SuperClass {
    ConstructorUsingSuper(){
        super(100,"java");
        System.out.println("This is no arg constructor of child class");
    }

    public static void main(String[] args){
        ConstructorUsingSuper obj= new ConstructorUsingSuper();

    }

}
//If the parent class has multiple constructors and the default constructor is being called by default, you can use the super keyword with specific parameters in the child class to explicitly call a parameterized constructor of the parent class. This ensures the parameterized constructor runs first, which may in turn call the default constructor if needed.