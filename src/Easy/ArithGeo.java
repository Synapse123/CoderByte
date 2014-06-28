package Easy;

import java.util.*;
import java.io.*;

class ArithGeo {

    String ArithGeo(int[] arr) {

        int diff = arr[1] - arr[0];
        int div = arr[1] / arr[0];

        String isArithGeo = "Arithmetic";

        for(int i = 2; i < arr.length; i++){
            if(arr[i] - arr[i-1] != diff){
                isArithGeo = "Geometric";
            }
        }

        if(isArithGeo.equals("Arithmetic")){
            return isArithGeo;
        }

        for(int i = 2; i < arr.length; i++){
            if(arr[i] / arr[i-1] != div){
                isArithGeo = "-1";
            }
        }

        return isArithGeo;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        ArithGeo c = new ArithGeo();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while(s.hasNext()){
            numbers.add(s.nextInt());
        }
        int[] numArr = new int[numbers.size()];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = numbers.get(i);
        }
        System.out.print(c.ArithGeo(numArr));
    }

}