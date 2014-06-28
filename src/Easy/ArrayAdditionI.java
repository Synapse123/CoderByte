package Easy;

import java.lang.reflect.Array;
import java.util.*;

class ArrayAdditionI {

    String ArrayAdditionI(int[] arr) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        for(int i = 0; i < arr.length-1; i++){
            numbers.add(arr[i]);
        }

        return calcSum(numbers, max);

    }

    public String calcSum(ArrayList<Integer> numbers, int max){

        if(numbers.size() == 1){
            if(numbers.get(0) == max){
                return "true";
            }else{
                return "false";
            }
        }

        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        if(sum == max){
            return "true";
        }

        for(int i = 0; i < numbers.size(); i++){

            ArrayList<Integer> left = (ArrayList<Integer>) numbers.clone();
            left.remove(i);

            String bool = calcSum(left, max);
            if(bool.equals("true")){
                return bool;
            }
        }

        return "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        ArrayAdditionI c = new ArrayAdditionI();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while(s.hasNext()){
            numbers.add(s.nextInt());
        }
        int[] numArr = new int[numbers.size()];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = numbers.get(i);
        }
        System.out.print(c.ArrayAdditionI(numArr));
    }

}