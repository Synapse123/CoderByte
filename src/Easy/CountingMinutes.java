package Easy;

import java.util.*;

class CountingMinutes {

    private static final int DAY = 24*60;

    String CountingMinutes(String str) {

        String[] times = str.split("-");
        int[] sumMinutes = new int[2];

        for(int i = 0; i < 2; i++){

            int hours = Integer.parseInt(times[i].split(":")[0]);
            int minutes = Integer.parseInt(times[i].split(":")[1].substring(0,2));
            String time = times[i].split(":")[1].substring(2);

            sumMinutes[i] = ((hours == 12) ? 0 : (hours * 60)) + (time.equals("am") ? 0 : DAY/2) + minutes;

        }

        if(sumMinutes[0] < sumMinutes[1]){
            return "" + (sumMinutes[1] - sumMinutes[0]);
        }else{
            return "" + (DAY - sumMinutes[0] + sumMinutes[1]);
        }

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        CountingMinutes c = new CountingMinutes();
        System.out.print(c.CountingMinutes(s.nextLine()));
    }

}