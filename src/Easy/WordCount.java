import java.util.*;
import java.io.*;

class WordCount {

    int WordCount(String str) {

        String[] words = str.split(" ");
        return words.length;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        WordCount c = new WordCount();
        System.out.print(c.WordCount(s.nextLine()));
    }

}