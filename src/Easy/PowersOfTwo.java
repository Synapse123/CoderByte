import java.util.*;
import java.io.*;

class PowersofTwo {

    String PowersofTwo(int num) {

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
        PowersofTwo c = new PowersofTwo();
        System.out.print(c.PowersofTwo(Integer.parseInt(s.nextLine())));
    }

}