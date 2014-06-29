package Medium;

import java.util.*;
import java.io.*;

class PalindromeTwo {

    String PalindromeTwo(String str) {

        String onlyLetters = "";
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                onlyLetters += "" + str.charAt(i);
            }
        }

        for(int i = 0, j = onlyLetters.length()-1; i < onlyLetters.length(); i++, j--){
            if(onlyLetters.charAt(i) != onlyLetters.charAt(j)){
               return "false";
            }
        }

        return "true";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        PalindromeTwo c = new PalindromeTwo();
        System.out.print(c.PalindromeTwo(s.nextLine()));
    }

}