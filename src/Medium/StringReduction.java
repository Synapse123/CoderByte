package Medium;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;
import java.io.*;

class StringReduction {

    private static final ArrayList<Character> chars = new ArrayList<Character>();

    int StringReduction(String str) {

        chars.add('a');
        chars.add('b');
        chars.add('c');

        boolean reduced = true;
        String redStr = str;

        while(reduced){
            reduced = false;
            for(int i = 1; i < redStr.length(); i++){
                if(redStr.charAt(i) != redStr.charAt(i-1)){
                    ArrayList<Character> exp = new ArrayList<Character>();
                    exp.add(redStr.charAt(i));
                    exp.add(redStr.charAt(i-1));
                    redStr = redStr.substring(0,i-1) + getReducedChar(exp) + redStr.substring(i+1);
                    reduced = true;
                    break;
                }
            }
        }

        return redStr.length();

    }

    private char getReducedChar(ArrayList<Character> exp) {

        ArrayList<Character> left = new ArrayList<Character>(chars);
        left.removeAll(exp);
        return left.get(0);

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        StringReduction c = new StringReduction();
        System.out.print(c.StringReduction(s.nextLine()));
    }

}