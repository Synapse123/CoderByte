package Easy;

import java.util.*;
import java.io.*;

class MeanMode {

    int MeanMode(int[] arr) {

        Arrays.sort(arr);
        int mode = -1;
        int mean = 0;

        for(int i = 0; i < arr.length; i++){
            mean += arr[i];
            if(i == 0){
                if(arr[i] == arr[i+1]){
                    mode = arr[i];
                }
            }else{
                if(arr[i] == arr[i-1]){
                    mode = arr[i];
                }
            }
        }

        mean /= arr.length;

        return (mode == mean) ? 1 : 0;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        MeanMode c = new MeanMode();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while(s.hasNext()){
            numbers.add(s.nextInt());
        }
        int[] numArr = new int[numbers.size()];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = numbers.get(i);
        }
        System.out.print(c.MeanMode(numArr));
    }

}