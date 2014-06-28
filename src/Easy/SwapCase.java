package Easy;

import java.util.*;

class SwapCase {

    String SwapCase(String str) {

        String res = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                res += (""+str.charAt(i)).toUpperCase();
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                res += (""+str.charAt(i)).toLowerCase();
            }else{
                res += str.charAt(i);
            }
        }

        return res;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        SwapCase c = new SwapCase();
        System.out.print(c.SwapCase(s.nextLine()));
    }

}