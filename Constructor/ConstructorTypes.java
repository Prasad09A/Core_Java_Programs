package Constructor;

import java.sql.SQLOutput;

class ConstructorMain{
    ConstructorMain(){
        System.out.println("No-arg constructor of Parent class");
    }

    ConstructorMain(int a){
        System.out.println("Argument constructor of parent class");
    }

}

public class ConstructorTypes extends ConstructorMain {
    public static void main(String[] args){
        ConstructorTypes obj= new ConstructorTypes();// This will call default constructor which is no args constructor

        ConstructorTypes obj2= new ConstructorTypes(); // This will call Parameterized constructor

    }

}
