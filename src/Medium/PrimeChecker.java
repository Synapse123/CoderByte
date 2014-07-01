package Medium;

import java.util.*;

class PrimeChecker {

    ArrayList<String> permutations = new ArrayList<String>();

    int PrimeChecker(int num) {

        permutation("", ""+num);

        for(String s: permutations){
            int x = Integer.parseInt(s);
            System.out.println(x);
            boolean isPrime = true;
            for(int i = 2; i < x/2 + 1; i++){
                if(x % i == 0){
                    System.out.println("false");
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && x != 1){
                return 1;
            }
        }

        return 0;

    }

    void permutation(String prefix, String num){
        if(num.length() == 0){
            permutations.add(prefix);
        }else{
            for(int i = 0; i < num.length(); i++){
                permutation(prefix + num.charAt(i), num.substring(0,i) + num.substring(i+1));
            }
        }
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        PrimeChecker c = new PrimeChecker();
        System.out.print(c.PrimeChecker(s.nextInt()));
    }

}