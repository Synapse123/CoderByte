package Medium;

import java.util.*;
import java.io.*;

class MultipleBrackets {

    String MultipleBrackets(String str) {

        int parenthesesOpen = 0;
        int squareBracketsOpen = 0;
        boolean hasBrackets = (str.contains("(") || str.contains(")") || str.contains("[") || str.contains("]"));
        int countBracketPairs = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                parenthesesOpen++;
            }else if(str.charAt(i) == '[') {
                squareBracketsOpen++;
            }else if(str.charAt(i) == ')'){
                parenthesesOpen--;
                countBracketPairs++;
            }else if(str.charAt(i) == ']'){
                squareBracketsOpen--;
                countBracketPairs++;
            }
            if(parenthesesOpen < 0 || squareBracketsOpen < 0){
                return "0";
            }
        }

        return ((parenthesesOpen == 0 && squareBracketsOpen == 0) || !hasBrackets) ? "1 " + countBracketPairs : "0";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        MultipleBrackets c = new MultipleBrackets();
        System.out.print(c.MultipleBrackets(s.nextLine()));
    }

}