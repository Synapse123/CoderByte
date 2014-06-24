import java.util.*;

public class LetterChanges {

    String LetterChanges(String str) {

        String newStr = "";

        for(int i = 0; i < str.length(); i++){

            char c = str.charAt(i);

            if(c == 'z'){
                c = 'A';
            }else if(c >= 'a' && c <= 'z'){
                c++;
                if(c == 'a') c = 'A';
                if(c == 'e') c = 'E';
                if(c == 'i') c = 'I';
                if(c == 'o') c = 'O';
                if(c == 'u') c = 'U';
            }

            newStr += c;

        }

        return newStr;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        LetterChanges c = new LetterChanges();
        System.out.print(c.LetterChanges(s.nextLine()));
    }

}

  