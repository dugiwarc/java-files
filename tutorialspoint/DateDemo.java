import java.util.*;
import java.text.*;

public class DateDemo {
    public static void main(String args[]) {
        Date date = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.print(input + " Parses as ");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (Exception e) {
            System.out.println("Unparseable using " + ft);
            // TODO: handle exception
        }
        System.out.println("Current Date: " + ft.format(date));
        System.out.println(date.toString());

    }
}