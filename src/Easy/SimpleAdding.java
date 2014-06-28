package Easy;

import java.util.Scanner;

/**
 * Created by jasmin on 24.06.14.
 */
public class SimpleAdding {

    int SimpleAdding(int num) {

        int sum = 0;

        for(int i = 1; i <= num; i++){

            sum += i;

        }

        return sum;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        SimpleAdding c = new SimpleAdding();
        System.out.print(c.SimpleAdding(Integer.parseInt(s.nextLine())));
    }

}
