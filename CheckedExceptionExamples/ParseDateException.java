package CheckedExceptionExamples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDateException {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date d = sdf.parse("hello");
        } catch (ParseException e) {
            System.out.println("Wrong date format");
            System.out.println("Exception occurs because date format is not proper");
        }

    }
}
