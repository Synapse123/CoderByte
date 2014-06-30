package Medium;

import java.util.*;
import java.io.*;

class CaesarCipher {

    String CaesarCipher(String str, int num) {

        String caesar = "";

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if (str.charAt(i) + num <= 'z') {
                    caesar += "" + (char) (str.charAt(i) + num);
                } else {
                    caesar += "" + (char) ('a' + ((str.charAt(i) + num) - 'z') - 1);
                }
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                if (str.charAt(i) + num <= 'Z') {
                    caesar += "" + (char) (str.charAt(i) + num);
                } else {
                    caesar += "" + (char) ('A' + ((str.charAt(i) + num) - 'Z') - 1);
                }
            }else{
                caesar += "" + str.charAt(i);
            }
        }

        return caesar;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        CaesarCipher c = new CaesarCipher();
        System.out.print(c.CaesarCipher(s.nextLine(), s.nextInt()));
    }

}