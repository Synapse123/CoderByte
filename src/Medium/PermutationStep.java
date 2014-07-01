package Medium;

import java.util.*;

class PermutationStep {

    ArrayList<String> permutations = new ArrayList<String>();

    int PermutationStep(int num) {

        permutation("", ""+num);

        int next = Integer.MAX_VALUE;
        boolean max = false;

        for(String s: permutations){
            int i = Integer.parseInt(s);
            if(i == Integer.MAX_VALUE && next == Integer.MAX_VALUE) max = true; // in case the next bigger number is
                                                                                // Integer.MAX_VALUE
            if(i > num && i < next){
                next = i;
                max = false;
            }
        }

        return (!max && next == Integer.MAX_VALUE) ? -1 : next;

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
        PermutationStep c = new PermutationStep();
        System.out.print(c.PermutationStep(s.nextInt()));
    }

}