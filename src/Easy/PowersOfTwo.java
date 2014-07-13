package Easy;

import java.util.*;

class PowersOfTwo {

    String PowersOfTwo(int num) {

        if(num == 1){
            return "true";
        }

        int pow2 = 2;

        while(pow2 <= num){
            if(pow2 == num){
                return "true";
            }
            pow2 *= 2;
        }

        return "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        PowersOfTwo c = new PowersOfTwo();
        System.out.print(c.PowersOfTwo(Integer.parseInt(s.nextLine())));
    }

}