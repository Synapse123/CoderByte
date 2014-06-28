package Medium;

import java.util.*;
import java.io.*;

class PrimeTime {

    String PrimeTime(int num) {

        for(int i = 2; i < num/2 + 1; i++){
            if(num % i == 0){
                return "false";
            }
        }

        return "true";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        PrimeTime c = new PrimeTime();
        System.out.print(c.PrimeTime(Integer.parseInt(s.nextLine())));
    }

}