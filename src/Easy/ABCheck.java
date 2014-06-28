import java.util.*;
import java.io.*;

class ABCheck {
    String ABCheck(String str) {

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                if(i+4 < str.length() && str.charAt(i+4) == 'b'){
                    return "true";
                }
            }
        }

        return "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        ABCheck c = new ABCheck();
        System.out.print(c.ABCheck(s.nextLine()));
    }

}