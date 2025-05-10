package Constructor;

class ConstructorCombined{
    ConstructorCombined(){
        System.out.println("This is no args constructor of parent class");
    }

    ConstructorCombined(int a){
        System.out.println("This is 1 args constructor of parent class");
    }

    ConstructorCombined(int a, String b){
        this();
        System.out.println("This is 2 args constructor of parent class");
    }
}

public class ConstructorSuperThis extends ConstructorCombined{
    ConstructorSuperThis(){
        super(100,"java");
        System.out.println("This is no arg constructor of child class");
    }

    public static void main(String[] args){
        ConstructorSuperThis obj= new ConstructorSuperThis();
    }
}
