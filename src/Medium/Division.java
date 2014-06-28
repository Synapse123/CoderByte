package Medium;

import java.util.*;
import java.io.*;

class Division {

    int Division(int a, int b) {

        int div1 = Math.max(a,b);
        int div2 = Math.min(a,b);

        for(;;){
            int tmp = div2;
            div2 = div1 % div2;
            div1 = tmp;
            if(div2 == 0) {
                return div1;
            }
        }

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        Division c = new Division();
        System.out.print(c.Division(s.nextInt(), s.nextInt()));
    }

}