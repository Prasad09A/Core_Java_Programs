package StringPrograms;

public class EndsWithSubstring {
    public static void main(String[] args) {
        String str1="Exercises";
        String str2="Exercise";

        String suffix= "se";

        System.out.println(str1+ " ends with "+suffix +" suffix  is "+str1.endsWith(suffix));
        System.out.println(str1+" ends with "+suffix +" suffix is "+str2.endsWith(suffix));
    }
}
