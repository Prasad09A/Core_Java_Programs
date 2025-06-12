package StringPrograms;

public class UnicodePointsInRange {
    public static void main(String[] args) {

        String str= "prasad";

        int Begins=0;
        int Ends=6;

        int count= str.codePointCount(Begins,Ends);
        System.out.println(count);
    }
}
