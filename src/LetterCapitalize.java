import java.util.*;
import java.io.*;

class LetterCapitalize {
    String LetterCapitalize(String str) {

        String[] words = str.split(" ");
        String ret = (words[0].charAt(0) + "").toUpperCase() + words[0].substring(1);

        for(int i = 1; i < words.length; i++){

            words[i] = (words[i].charAt(0) + "").toUpperCase() + words[i].substring(1);
            ret += " " + words[i];

        }

        return ret;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        LetterCapitalize c = new LetterCapitalize();
        System.out.print(c.LetterCapitalize(s.nextLine()));
    }

}