package Medium;

import java.util.*;

class SwapII {

    String SwapII(String str) {

        String res = "";

        int begin = -1;
        boolean foundBegin = false;

        for(int i = 0; i < str.length(); i++){
            // change cases
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                res += (""+str.charAt(i)).toUpperCase();
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                res += (""+str.charAt(i)).toLowerCase();
            }else{
                res += str.charAt(i);
            }
            // swap numbers
            if(!foundBegin && isNumber(str.charAt(i))){
                begin = i;
                foundBegin = true;
            }else if(str.charAt(i) == ' ' || (i > 0 && isNumber(str.charAt(i)) && isNumber(str.charAt(i-1)))){
                begin = i;
                foundBegin = false;
            }else if(foundBegin && isNumber(str.charAt(i))){
                res = res.substring(0,begin) + str.charAt(i) + res.substring(begin+1,
                        i) + str.charAt(begin) + ((i + 1 < res.length()) ? res.substring(i+1) : "");
                begin = -1;
                foundBegin = false;
            }
        }

        return res;

    }

    private boolean isNumber(char c){
        return c >= '0' && c <= '9';
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        SwapII c = new SwapII();
        System.out.print(c.SwapII(s.nextLine()));
    }

}