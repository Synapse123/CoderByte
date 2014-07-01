package Medium;

import java.util.*;
import java.io.*;

class DashInsertII {

    String DashInsertII(long num) {

        String numS = "" + num;
        LinkedHashMap<Integer, Character> pos = new LinkedHashMap<Integer, Character>();

        for(int i = 1; i < numS.length(); i++){
            int act = Integer.parseInt("" + numS.charAt(i));
            int prev = Integer.parseInt("" + numS.charAt(i-1));
            if (act % 2 == 1 && prev % 2 == 1) {
                pos.put(i, '-');
            }else if (act != 0 && prev != 0 && act % 2 == 0 && prev % 2 == 0) {
                pos.put(i, '*');
            }
        }

        int i = 0;
        for(int x: pos.keySet()){
            numS = numS.substring(0, x+i) + pos.get(x) + numS.substring(x+i);
            i++;
        }

        return numS;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        DashInsertII c = new DashInsertII();
        System.out.print(c.DashInsertII(Long.parseLong(s.nextLine())));
    }

}