package java2DArray;

import java.io.*;
import java.util.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        List<Integer> sumValue = new ArrayList<>();

        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                int stepY = y;
                int auxiliaryStepY = stepY;
                int sumHourglass = 0;
                while (stepY < 3 + y) {
                    int stepX = x;
                    int auxiliaryStepX = stepX;
                    int sumX = 0;
                    while (stepX < 3 + x) {
                        if (stepY == auxiliaryStepY + 1) {
                            if (stepX == auxiliaryStepX + 1) {
                                sumX += arr.get(stepY).get(stepX);
                            }
                        } else {
                            sumX += arr.get(stepY).get(stepX);
                        }
                        stepX++;
                    }
                    sumHourglass += sumX;
                    stepY++;
                }
                sumValue.add(sumHourglass);
            }
        }
        System.out.println(Collections.max(sumValue));

    }
}