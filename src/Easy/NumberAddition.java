import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NumberAddition {

    int NumberAddition(String str) {

        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(str);

        ArrayList<Integer> nums = new ArrayList<Integer>();

        while (m.find()){
            nums.add(Integer.parseInt(str.substring(m.start(), m.end())));
        }

        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }

        return sum;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        NumberAddition c = new NumberAddition();
        System.out.print(c.NumberAddition(s.nextLine()));
    }

}