package Medium;

import java.util.*;
import java.io.*;

class BinaryConverter {

    int BinaryConverter(String str) {

        int decimal = 0;

        for(int i = str.length()-1; i >= 0; i--){
            if(str.charAt(i) == '1'){
                decimal += Math.pow(2,str.length()-1-i);
            }
        }

        return decimal;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        BinaryConverter c = new BinaryConverter();
        System.out.print(c.BinaryConverter(s.nextLine()));
    }

}