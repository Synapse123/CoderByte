package Easy;

import java.util.*;
import java.io.*;

class DivisionStringified {

    String DivisionStringified(int num1, int num2) {

        String res = "" + (int) Math.round((double) num1 / num2);

        int commas = res.length() / 3;
        if(res.length() % 3 == 0){
            commas--;
        }

        for(int i = 1; i <= commas; i ++){
            res = res.substring(0, res.length() - i*3 - i+1) + "," + res.substring(res.length() - i*3 - i+1);
        }

        return res;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        DivisionStringified c = new DivisionStringified();
        System.out.print(c.DivisionStringified(s.nextInt(), s.nextInt()));
    }

}