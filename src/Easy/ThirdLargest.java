package Easy;

import java.util.*;
import java.io.*;

class ThirdLargest {

    String ThirdLargest(String[] strArr) {

        Arrays.sort(strArr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        return strArr[2];

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        ThirdLargest c = new ThirdLargest();
        ArrayList<String> strings = new ArrayList<String>();
        while(s.hasNext()){
            strings.add(s.next());
        }
        String[] stringArr = new String[strings.size()];
        for(int i = 0; i < stringArr.length; i++){
            stringArr[i] = strings.get(i);
        }
        System.out.print(c.ThirdLargest(stringArr));
    }

}