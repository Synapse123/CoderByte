import java.util.Scanner;

/**
 * Created by jasmin on 24.06.14.
 */
public class LargestWord {

    String LongestWord(String sen) {

        String[] words = sen.split(" .");

        String max = "";
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].replaceAll("\\W", "");
            if(words[i].length() >= max.length()){
                max = words[i];
            }
        }

        return max;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        LargestWord c = new LargestWord();
        System.out.print(c.LongestWord(s.nextLine()));
    }

}
