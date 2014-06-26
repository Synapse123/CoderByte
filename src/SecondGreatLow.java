import java.util.*;
import java.io.*;

class SecondGreatLow {

    String SecondGreatLow(int[] arr) {

        Arrays.sort(arr);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(i == 0 || arr[i] != arr[i-1]){
                numbers.add(arr[i]);
            }
        }

        if(numbers.size() == 1){
            return numbers.get(0) + " " + numbers.get(0);
        }else{
            return numbers.get(1) + " " + numbers.get(numbers.size()-2);
        }

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        SecondGreatLow c = new SecondGreatLow();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while(s.hasNext()){
            numbers.add(s.nextInt());
        }
        int[] numArr = new int[numbers.size()];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = numbers.get(i);
        }
        System.out.print(c.SecondGreatLow(numArr));
    }

}