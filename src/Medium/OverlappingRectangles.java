package Medium;

import java.util.*;
import java.io.*;

class OverlappingRectangles {

    int OverlappingRectangles(String[] strArr) {

        String[] splitC = strArr[0].substring(1,strArr[0].length()-1).split("\\),\\(");
        String[] coordRect1 = {splitC[0], splitC[1], splitC[2], splitC[3]};
        String[] coordRect2 = {splitC[4], splitC[5], splitC[6], splitC[7]};

        int[][] upperLeft = {{Integer.MAX_VALUE, Integer.MIN_VALUE}, {Integer.MAX_VALUE, Integer.MIN_VALUE}};
        int[][] lowerRight = {{Integer.MIN_VALUE, Integer.MAX_VALUE}, {Integer.MIN_VALUE, Integer.MAX_VALUE}};

        for(int i = 0; i < 4; i++){
            String[] pointR1S = coordRect1[i].split(",");
            int[] pointR1 = {Integer.parseInt(pointR1S[0]), Integer.parseInt(pointR1S[1])};
            String[] pointR2S = coordRect2[i].split(",");
            int[] pointR2 = {Integer.parseInt(pointR2S[0]), Integer.parseInt(pointR2S[1])};

            if(pointR1[0] <= upperLeft[0][0] && pointR1[1] >= upperLeft[0][1]){
                upperLeft[0][0] = pointR1[0];
                upperLeft[0][1] = pointR1[1];
            }else if(pointR1[0] >= lowerRight[0][0] && pointR1[1] <= lowerRight[0][1]){
                lowerRight[0][0] = pointR1[0];
                lowerRight[0][1] = pointR1[1];
            }
            if(pointR2[0] <= upperLeft[1][0] && pointR2[1] >= upperLeft[1][1]){
                upperLeft[1][0] = pointR2[0];
                upperLeft[1][1] = pointR2[1];
            }else if(pointR2[0] >= lowerRight[1][0] && pointR2[1] <= lowerRight[1][1]){
                lowerRight[1][0] = pointR2[0];
                lowerRight[1][1] = pointR2[1];
            }
        }

        // area of overlapping rectangle
        int[] upperLeftO = {Math.max(upperLeft[0][0], upperLeft[1][0]), Math.min(upperLeft[0][1], upperLeft[1][1])};
        int[] lowerRightO = {Math.min(lowerRight[0][0], lowerRight[1][0]), Math.max(lowerRight[0][1], lowerRight[1][1])};
        int areaO = Math.abs(lowerRightO[0] - upperLeftO[0]) * Math.abs(lowerRightO[1] - upperLeftO[1]);

        if(areaO == 0){
            return 0;
        }

        // area of rectangle 1
        int areaR1 = Math.abs(lowerRight[0][0] - upperLeft[0][0]) * Math.abs(lowerRight[0][1] - upperLeft[0][1]);

        // calc how many times areaO fits into areaR1 -> very simplistic approach (can be wrong in some rare cases)
        int wAreaO = lowerRightO[0] - upperLeftO[0];
        int hAreaO = upperLeftO[1] - lowerRightO[1];
        int wAreaR1 = lowerRight[0][0] - upperLeft[0][0];
        int hAreaR1 = upperLeft[0][1] - lowerRight[0][1];
        int inWidth = wAreaR1 / wAreaO;
        int inHeight = hAreaR1 / hAreaO;

        int wLeft = wAreaR1 - inWidth*wAreaO;
        int hLeft = hAreaR1 - inHeight*hAreaO;

        int newWAreaR1 = 0;
        int newHAreaR1 = 0;
        int inWidth2 = 0;
        int inHeight2 = 0;

        if(wLeft > 0){
            newWAreaR1 = hAreaR1;
            newHAreaR1 = wLeft;
        }else if(hLeft > 0){
            newWAreaR1 = wAreaR1;
            newHAreaR1 = hLeft;
        }

        inWidth2 = newWAreaR1 / wAreaO;
        inHeight2 = newHAreaR1 / hAreaO;

        return inWidth * inHeight + inWidth2 * inHeight2;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        OverlappingRectangles c = new OverlappingRectangles();
        System.out.print(c.OverlappingRectangles(new String[]{s.nextLine()}));
    }

}