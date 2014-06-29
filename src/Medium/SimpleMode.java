package Medium;

import java.util.*;
import java.io.*;

class SimpleMode {

    int SimpleMode(int[] arr) {

        LinkedHashMap<Integer, Integer> counts = new LinkedHashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++){
            if(counts.containsKey(arr[i])){
                counts.replace(arr[i], counts.get(arr[i])+1);   // CoderByte only takes counts.put(...)
            }else{
                counts.put(arr[i], 1);
            }
        }

        int max = 0;
        int number = -1;
        Iterator it = counts.keySet().iterator();
        while(it.hasNext()){
            int key = (Integer) it.next();
            int value = counts.get(key);
            if(value > max && value != 1){
                max = value;
                number = key;
            }
        }

        return number;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        SimpleMode c = new SimpleMode();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while(s.hasNext()){
            numbers.add(s.nextInt());
        }
        int[] numArr = new int[numbers.size()];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = numbers.get(i);
        }
        System.out.print(c.SimpleMode(numArr));
    }

}