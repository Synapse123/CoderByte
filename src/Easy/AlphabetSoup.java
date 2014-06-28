package Easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jasmin on 25.06.14.
 */
public class AlphabetSoup {

    String AlphabetSoup(String str) {

        /*char[] letters = str.toCharArray();
        Arrays.sort(letters);
        return new String(letters);*/

        String res = "" + str.charAt(0);

        for(int i = 1; i < str.length(); i++){
            for(int j = 0; j < res.length(); j++) {
                if (str.charAt(i) < res.charAt(j)) {
                    res = str.charAt(i) + res;
                    break;
                }else if(j == res.length()-1){
                    res = res + str.charAt(i);
                    break;
                }else if(str.charAt(i) >= res.charAt(j) && str.charAt(i) <= res.charAt(j+1)){
                    res = res.substring(0,j+1) + str.charAt(i) + res.substring(j+1);
                    break;
                }
            }
        }

        return res;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        AlphabetSoup c = new AlphabetSoup();
        System.out.print(c.AlphabetSoup(s.nextLine()));
    }

}
