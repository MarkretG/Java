package task1;

import java.util.Scanner;

public class CommonElementBetweenTwoNumericArray {
    static Scanner sc = new Scanner(System.in);

    public static void findCommonElement(int[] array1,int[] array2) {
        int array1Size=array1.length;
        int array2Size=array2.length;
        System.out.println("common element");
        for (int i = 0; i < array1Size; i++) {
            for (int j = 0; j < array2Size; j++) {
                if (array1[i] == array2[j])
                    System.out.println(array1[i]);
            }
        }
    }
}
