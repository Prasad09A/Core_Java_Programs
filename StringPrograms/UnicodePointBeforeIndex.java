package StringPrograms;

public class UnicodePointBeforeIndex {
    public static void main(String[] args) {
        String str= "Prasad2A";

        int index1= 1;

        int codepoint1= str.codePointBefore(index1);
        System.out.println(codepoint1);

        int index2= 7;

        int codepoint2= str.codePointBefore(index2);
        System.out.println(codepoint2);

    }
}
