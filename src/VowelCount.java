import java.util.*;
import java.io.*;

class VowelCount {

    int VowelCount(String str) {

        int vowelsCnt = 0;

        for(int i = 0; i < str.length(); i++){
            if("aeiouAEIOU".contains(String.valueOf(str.charAt(i)))){
                vowelsCnt++;
            }
        }

        return vowelsCnt;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        VowelCount c = new VowelCount();
        System.out.print(c.VowelCount(s.nextLine()));
    }

}