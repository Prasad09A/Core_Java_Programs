package StringPrograms;

public class CompareCharSequence {
    public static void main(String[] args) {

        String str1="example1";
        String str2="Example1";
        String str3="example1";

        System.out.println("comparing "+str1+" and "+str3+ " is "+str1.contentEquals(str3));
        System.out.println("comparing "+ str2+ " and "+ str3+ " is "+str2.contentEquals(str3));
    }
}
