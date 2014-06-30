package Medium;

import java.util.*;
import java.io.*;

class FormattedDivision {

    String FormattedDivision(int num1, int num2) {

        double res = (double) num1 / num2;
        String formatted = String.format("%.4f", res);

        int commas = (formatted.length() - 5) / 3;
        if((formatted.length() - 5) % 3 == 0){
            commas--;
        }

        for(int i = 1; i <= commas; i ++){
            formatted = formatted.substring(0, formatted.length() - 5 - i*3 - i+1) + "," +
                    "" + formatted.substring(formatted.length() - 5 - i*3 - i+1);
        }

        return formatted;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        FormattedDivision c = new FormattedDivision();
        System.out.print(c.FormattedDivision(s.nextInt(), s.nextInt()));
    }

}