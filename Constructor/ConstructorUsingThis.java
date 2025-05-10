package Constructor;

import java.sql.SQLOutput;

class ConstructorThis{
    ConstructorThis(){
        this(300);
        System.out.println("This is default constructor of Parent class");
    }

    ConstructorThis(int a){
        System.out.println("This is 1 arg paramterized constructor of parent class");
    }

    ConstructorThis(int a, String b, long l){
        System.out.println("This is 3 arg constructor of parent class");
    }
}

public class ConstructorUsingThis extends ConstructorThis{
    ConstructorUsingThis(){
        System.out.println("This is  default constructor of child class");
    }

    public static void main(String[] args) {
        ConstructorUsingThis obj= new ConstructorUsingThis();
    }
}

//this keyword refers to the current object of the same class and is commonly used within methods or constructors.
//In this case, when we create an object of the child class which has a default constructor (with no parameters), it normally calls the default constructor of the parent class first.However, inside the parent class constructor, we used the "this" keyword with parameters to call the parameterized constructor of the same (parent) class. This causes the parameterized constructor to execute first.
//From there, the parameterized constructor can use super() to call the default constructor of the child class. Finally, after these calls complete, the child class's default constructor runs.
