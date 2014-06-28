package Medium;

import java.util.*;
import java.io.*;

class StringScramble {

    String StringScramble(String str1, String str2) {

        for(int i = 0; i < str2.length(); i++){
            if(!str1.contains(""+str2.charAt(i))){
                return "false";
            }
        }

        return "true";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        StringScramble c = new StringScramble();
        System.out.print(c.StringScramble(s.nextLine(), s.nextLine()));
    }

}