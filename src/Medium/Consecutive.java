package Medium;

import java.util.*;
import java.io.*;

class Consecutive {

    int Consecutive(int[] arr) {

        Arrays.sort(arr);

        int needed = 0;

        for(int i = 1; i < arr.length; i++){
            int range = arr[i] - arr[i-1];
            needed += (range == 0) ? 0 : range - 1;
        }

        return needed;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        Consecutive c = new Consecutive();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while(s.hasNext()){
            numbers.add(s.nextInt());
        }
        int[] numArr = new int[numbers.size()];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = numbers.get(i);
        }
        System.out.print(c.Consecutive(numArr));
    }

}