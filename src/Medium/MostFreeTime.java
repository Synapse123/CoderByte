package Medium;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

class MostFreeTime {

    private static final int DAY = 24*60;

    String MostFreeTime(String[] strArr) {

        /*
        // Didn't work @ CoderByte because of Comparator

        ArrayList<ArrayList<String>> events = new ArrayList<ArrayList<String>>();

        for(int i = 0; i < strArr.length; i++){
            ArrayList<String> event = new ArrayList<String>();
            event.add(strArr[i].split("-")[0]);
            event.add(strArr[i].split("-")[1]);
            events.add(event);
        }

        events.sort(new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return calcMinutes(o1.get(0)) - calcMinutes(o2.get(0));
            }
        });

        int maxFreeTime = 0;
        for(int i = 0; i < strArr.length - 1; i++){
            maxFreeTime = Math.max(maxFreeTime, diffMinutes(events.get(i).get(1), events.get(i+1).get(0)));
        }*/

        TreeMap<Integer,ArrayList<String>> events = new TreeMap<Integer, ArrayList<String>>();

        for(int i = 0; i < strArr.length; i++){
            ArrayList<String> event = new ArrayList<String>();
            event.add(strArr[i].split("-")[0]);
            event.add(strArr[i].split("-")[1]);
            events.put(calcMinutes(event.get(0)), event);
        }

        int maxFreeTime = 0;
        String endBefore = "";
        for(ArrayList<String> event: events.values()){
            System.out.println(event.get(0) + " - " + event.get(1));

            if(endBefore.length() > 0){
                maxFreeTime = Math.max(maxFreeTime, diffMinutes(endBefore, event.get(0)));
            }
            endBefore = event.get(1);
        }

        int hours = maxFreeTime/60;
        int minutes = maxFreeTime%60;

        return ((hours < 10) ? "0" + hours : hours) + ":" + ((minutes < 10) ? "0" + minutes : minutes);

    }

    private int calcMinutes(String time){
        int hours = Integer.parseInt(time.split(":")[0]);
        int minutes = Integer.parseInt(time.split(":")[1].substring(0, 2));
        String t = time.split(":")[1].substring(2);

        return ((hours == 12) ? 0 : (hours * 60)) + (t.equalsIgnoreCase("AM") ? 0 : DAY/2) + minutes;
    }

    private int diffMinutes(String time1, String time2){
        int min1 = calcMinutes(time1);
        int min2 = calcMinutes(time2);
        return min2 - min1;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        MostFreeTime c = new MostFreeTime();
        ArrayList<String> lines = new ArrayList<String>();
        while(s.hasNextLine()){
            lines.add(s.nextLine());
        }
        String[] strArr = new String[lines.size()];
        for(int i = 0; i < lines.size(); i++){
            strArr[i] = lines.get(i);
        }
        System.out.print(c.MostFreeTime(strArr));
    }

}