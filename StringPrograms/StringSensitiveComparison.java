package StringPrograms;

public class StringSensitiveComparison {
    public static void main(String[] args) {

        String str1="example1";
        String str2="Example1";



        if(str1.equalsIgnoreCase(str2)){
            System.out.println(str1+ " and " + str2 +" are equals");
        }else{
            System.out.println(str1+ "and "+ str2+ " are not equal");
        }
    }
}
