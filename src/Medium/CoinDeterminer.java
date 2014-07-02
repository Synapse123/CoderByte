package Medium;

import java.util.*;

class CoinDeterminer {

    int[] coins = {1,5,7,9,11};
    ArrayList<Integer> solutions = new ArrayList<Integer>();

    int CoinDeterminer(int num) {

        getCombinationsRec(num, 0);

        int min = Integer.MAX_VALUE;
        for(int i: solutions){
            if(i < min){
                min = i;
            }
        }

        return min;

    }

    private void getCombinationsRec(int sum, int sumCoins){

        for(int i = 0; i < coins.length; i++){
            int newSum = sum - coins[i];
            int newSumCoins = sumCoins + 1;
            if(newSum < 0){
                break;
            }
            if(newSum == 0){
                solutions.add(newSumCoins);
                break;
            }
            getCombinationsRec(newSum, newSumCoins);
        }

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        CoinDeterminer c = new CoinDeterminer();
        System.out.print(c.CoinDeterminer(s.nextInt()));
    }

}