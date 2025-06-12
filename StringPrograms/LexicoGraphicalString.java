package StringPrograms;

public class LexicoGraphicalString {
    public static void main(String[] args) {

        String str1= "Example 1";
        String str2= "Example 2";

        int result= str1.compareTo(str2);

        if(result==0){
            System.out.println(str1+ "is equal to "+ str2);
        }else if(result<0){
            System.out.println(str1+ " is less than to "+ str2);
        }else{
            System.out.println(str1+ " is grarter than to"+ str2);
        }
    }
}
