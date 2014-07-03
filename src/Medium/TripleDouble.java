package Medium;

import java.util.*;
import java.io.*;

class TripleDouble {

    int TripleDouble(long num1, long num2) {

        String num1s = ""+num1;
        String num2s = ""+num2;

        if(num1s.length() < 3){
            return 0;
        }

        boolean hasTriple = false;
        ArrayList<Character> numbers = new  ArrayList<Character>();
        for(int i = 2; i < num1s.length(); i++){
            if(num1s.charAt(i-2) == num1s.charAt(i-1) && num1s.charAt(i-1) == num1s.charAt(i)){
                hasTriple = true;
                numbers.add(num1s.charAt(i));
            }
        }

        if(!hasTriple){
            return 0;
        }

        boolean hasDouble = false;
        for(int i = 1; i < num2s.length(); i++){
            if(num2s.charAt(i-1) == num2s.charAt(i) && numbers.contains(num2s.charAt(i))){
                hasDouble = true;
            }
        }

        return hasDouble ? 1 : 0;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        TripleDouble c = new TripleDouble();
        System.out.print(c.TripleDouble(s.nextLong(), s.nextLong()));
    }

}