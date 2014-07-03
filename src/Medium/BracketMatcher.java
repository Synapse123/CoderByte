package Medium;

import java.util.*;
import java.io.*;

class BracketMatcher {

    int BracketMatcher(String str) {

        int bracketsOpen = 0;
        boolean hasBrackets = false;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                hasBrackets = true;
                bracketsOpen++;
            }else if(str.charAt(i) == ')'){
                hasBrackets = true;
                bracketsOpen--;
                if(bracketsOpen < 0){
                    return 0;
                }
            }
        }

        return (bracketsOpen == 0 || !hasBrackets) ? 1 : 0;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        BracketMatcher c = new BracketMatcher();
        System.out.print(c.BracketMatcher(s.nextLine()));
    }

}