package Medium;

import java.util.*;
import java.io.*;

class FibonacciChecker {

    String FibonacciChecker(int num) {

        if(num == 0 || num == 1){
            return "yes";
        }

        int i = 1;
        int j = 1;
        int k = 2;
        while(k < num){
            i = j;
            j = k;
            k = i + j;
        }

        return (k == num) ? "yes" : "no";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        FibonacciChecker c = new FibonacciChecker();
        System.out.print(c.FibonacciChecker(s.nextInt()));
    }

}