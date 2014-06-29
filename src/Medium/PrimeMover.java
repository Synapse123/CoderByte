package Medium;

import java.util.*;
import java.io.*;

class PrimeMover {

    int PrimeMover(int num) {

        int prime = 1;

        for(int i = 2;; i++){
            if(num == 0){
                break;
            }
            boolean isPrime = true;
            for(int j = 2; j < i/2 + 1; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                prime = i;
                num--;
            }
        }

        return prime;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        PrimeMover c = new PrimeMover();
        System.out.print(c.PrimeMover(s.nextInt()));
    }

}