package Easy;

import java.util.*;
import java.io.*;

class DashInsert {

    String DashInsert(int num) {

        String numS = "" + num;
        ArrayList<Integer> dashPos = new ArrayList<Integer>();

        for(int i = 1; i < numS.length(); i++){
            if (Integer.parseInt("" + numS.charAt(i)) % 2 == 1 && Integer.parseInt("" + numS.charAt(i - 1)) % 2 == 1) {
                dashPos.add(i);
            }
        }

        for(int i = 0; i < dashPos.size(); i++){
            numS = numS.substring(0, dashPos.get(i)+i) + "-" + numS.substring(dashPos.get(i)+i);
        }

        return numS;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        DashInsert c = new DashInsert();
        System.out.print(c.DashInsert(Integer.parseInt(s.nextLine())));
    }

}