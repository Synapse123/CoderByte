package Medium;

import java.util.*;
import java.io.*;

class ThreeFiveMultiples {

    int ThreeFiveMultiples(int num) {

        int sum = 0;

        for(int i = 1; i < num; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }

        return sum;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        ThreeFiveMultiples c = new ThreeFiveMultiples();
        System.out.print(c.ThreeFiveMultiples(s.nextInt()));
    }

}