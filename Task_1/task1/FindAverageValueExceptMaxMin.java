package task1;

import java.util.Scanner;

public class FindAverageValueExceptMaxMin {
    static Scanner sc = new Scanner(System.in);

    public static void findAverage(int[] array1) {
        int arraySize=array1.length;
        int max, min, sum = 0;
        float average;
        max = array1[0];
        min = array1[0];
        for (int i = 0; i < arraySize; i++) {
            if (max < array1[i])
                max = array1[i];
            if (min > array1[i])
                min = array1[i];
            sum = sum + array1[i];
        }
        int total=sum-(max+min);
        average=(float)total/arraySize;
        System.out.println("Average:"+average);

    }
}
