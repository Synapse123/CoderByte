import java.util.*;
import java.io.*;

class Palindrome {

    String Palindrome(String str) {

        for(int i = 0, j = str.length()-1; i < str.length(); i++, j--){
            if(str.charAt(i) == ' ') i++;
            if(str.charAt(j) == ' ') j--;
            if(str.charAt(i) != str.charAt(j)){
                return "false";
            }
        }

        return "true";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        Palindrome c = new Palindrome();
        System.out.print(c.Palindrome(s.nextLine()));
    }

}