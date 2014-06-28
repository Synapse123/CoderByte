package Easy;

import java.util.*;

public class FirstFactorial {

    long FirstFactorial(long num) {

        if(num == 1){
            return 1;
        }

        return num * FirstFactorial(num - 1);

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        FirstFactorial c = new FirstFactorial();
        System.out.print(c.FirstFactorial(Long.parseLong(s.nextLine())));
    }

}