package Medium;

import java.util.*;
import java.io.*;

class LetterCount {

    String LetterCount(String str) {

        String[] words = str.split(" ");
        int[] sum = new int[words.length];

        for(int i = 0; i < words.length; i++){

            ArrayList<Character> characters = new ArrayList<Character>();
            words[i] = words[i].toLowerCase();

            for(int j = 0; j < words[i].length(); j++){

                if(!characters.contains(words[i].charAt(j))){
                    characters.add(words[i].charAt(j));
                }else{
                    sum[i]++;
                }

            }

        }

        int max = -1;
        int index = -1;
        for(int i = 0; i < sum.length; i++){
            if(sum[i] > max && sum[i] != 0){
                max = sum[i];
                index = i;
            }
        }

        return (index != -1) ? words[index] : "-1";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        LetterCount c = new LetterCount();
        System.out.print(c.LetterCount(s.nextLine()));
    }

}