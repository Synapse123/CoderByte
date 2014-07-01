package Medium;

import java.util.*;

class DistinctList {

    int DistinctList(int[] arr){

        int duplicates = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                duplicates++;
            }
        }

        return duplicates;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        DistinctList c = new DistinctList();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while(s.hasNext()){
            numbers.add(s.nextInt());
        }
        int[] numArr = new int[numbers.size()];
        for(int i = 0; i < numArr.length; i++){
            numArr[i] = numbers.get(i);
        }
        System.out.print(c.DistinctList(numArr));
    }

}