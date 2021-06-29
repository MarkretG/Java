package task1;

import java.util.Scanner;

public class CommonElementBetweenTwoNumericArray {
    static Scanner sc = new Scanner(System.in);

    public static void findCommonElement() {
        System.out.println("enter array size");
        int array1Size = sc.nextInt();
        int array2Size = sc.nextInt();
        int[] array1 = new int[array1Size];
        int[] array2 = new int[array2Size];
        System.out.println("enter array1 elements");
        for (int i = 0; i < array1Size; i++)
            array1[i] = sc.nextInt();
        System.out.println("enter array2 elements");
        for (int i = 0; i < array2Size; i++)
            array2[i] = sc.nextInt();
        System.out.println("common element");
        for (int i = 0; i < array1Size; i++) {
            for (int j = 0; j < array2Size; j++) {
                if (array1[i] == (array2[j]))
                    System.out.println(array1[i]);
            }
        }
    }
}
