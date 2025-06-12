package StringPrograms;

public class CompareWithStringBuffer {
    public static void main(String[] args) {

        String str1="example";
        String str2="Example";

        StringBuffer str3= new StringBuffer(str1);

        System.out.println(str1.contentEquals(str3));
        System.out.println(str2.contentEquals(str3));

    }

}
