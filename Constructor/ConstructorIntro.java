package Constructor;

public class ConstructorIntro {
    int a;
    long b;
    char c='a';
    boolean t=true;
    String name;

    ConstructorIntro(){
        System.out.println("This is test method");
    }

    public static void main(String[] args) {
        ConstructorIntro obj= new ConstructorIntro();
        System.out.println("Default value for a is "+ obj.a);
        System.out.println("Default value for a is "+ obj.b);
        System.out.println("Default value for a is "+ obj.c);
        System.out.println("Default value for a is "+ obj.t);
        System.out.println("Default value for a is "+ obj.name);


    }

    void show(){
        System.out.println("This is show method");
    }
}
