package Constructor;
class ParentClass{
void show(){
    System.out.println("This is show method");
    }
}
public class UpCastingAndDownCasting extends ParentClass {
    public static void main(String[] args) {
        UpCastingAndDownCasting obj= new UpCastingAndDownCasting();  //No-casting

        ParentClass obj1= new UpCastingAndDownCasting(); //Up Casting
        obj1.show();

        UpCastingAndDownCasting obj2= (UpCastingAndDownCasting) new ParentClass(); //Down Casting
    }



}
