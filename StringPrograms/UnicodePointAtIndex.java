package StringPrograms;

public class UnicodePointAtIndex {
    public static void main(String[] args) {

        String str= "w3resource.com";

        int index1= 1;

        int codepoint1= str.codePointAt(1);
        System.out.println("Unicode point at "+ codepoint1);

        int index2=9;
        int codepoint2= str.codePointAt(9);

        System.out.println("Unicode point at"+codepoint2);
    }
}
