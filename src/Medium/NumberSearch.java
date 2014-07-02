package Medium;

import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NumberSearch {

    int NumberSearch(String str) {

        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(str);

        ArrayList<Integer> nums = new ArrayList<Integer>();

        while (m.find()){
            nums.add(Integer.parseInt(str.substring(m.start(), m.end())));
        }

        int letters = 0;
        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
                letters++;
            }
        }

        double sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }

        return (int) Math.round(sum / letters);

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        NumberSearch c = new NumberSearch();
        System.out.print(c.NumberSearch(s.nextLine()));
    }

}