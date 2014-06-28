package Medium;

import java.util.*;
import java.io.*;

class RunLength {

    String RunLength(String str) {

        if(str.length() == 1){
            return "1" + str.charAt(0);
        }
        String runLength = "";
        int count = 1;

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                runLength += "" + count + str.charAt(i-1);
                count = 1;
            }
        }
        runLength += "" + count + str.charAt(str.length()-1);

        return runLength;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        RunLength c = new RunLength();
        System.out.print(c.RunLength(s.nextLine()));
    }

}








  