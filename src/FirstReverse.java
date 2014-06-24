import java.util.*;

public class FirstReverse {

    String firstReverse(String str) {

        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }

        return rev;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        FirstReverse c = new FirstReverse();
        System.out.print(c.firstReverse(s.nextLine()));
    }

}           
