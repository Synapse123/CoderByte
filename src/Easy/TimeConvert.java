import java.util.Scanner;

/**
 * Created by jasmin on 25.06.14.
 */
public class TimeConvert {

    String TimeConvert(int num) {

        int hours = num / 60;
        int minutes = num % 60;

        return hours + ":" + minutes;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        TimeConvert c = new TimeConvert();
        System.out.print(c.TimeConvert(Integer.parseInt(s.nextLine())));
    }

}
