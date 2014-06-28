package Easy;

import java.util.*;
import java.io.*;

class ExOh {

    String ExOh(String str) {

        int numX = 0;
        int numO = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'x' || str.charAt(i) == 'X'){
                numX++;
            }else if(str.charAt(i) == 'o' || str.charAt(i) == 'O'){
                numO++;
            }
        }

        return (numX == numO) ? "true" : "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        ExOh c = new ExOh();
        System.out.print(c.ExOh(s.nextLine()));
    }

}