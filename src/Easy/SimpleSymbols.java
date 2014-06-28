package Easy;

import java.util.*;
import java.io.*;

class SimpleSymbols {

    String SimpleSymbols(String str) {

        String s = "true";

        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')){
                if(i == 0 || i == str.length()-1 || (str.charAt(i-1) != '+' || str.charAt(i+1) != '+')) {
                    System.out.println(i);
                    s = "false";
                    break;
                }
            }
        }

        return s;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        SimpleSymbols c = new SimpleSymbols();
        System.out.print(c.SimpleSymbols(s.nextLine()));
    }

}