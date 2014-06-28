package Easy;

import java.util.*;

class CheckNums {

    String CheckNums(int num1, int num2) {

        return (num2 > num1) ? "true" : ((num2 == num1) ? "-1" : "false");

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        CheckNums c = new CheckNums();
        System.out.print(c.CheckNums(s.nextInt(), s.nextInt()));
    }

}