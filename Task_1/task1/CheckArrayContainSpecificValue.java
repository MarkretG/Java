package task1;

import java.util.Scanner;

public class CheckArrayContainSpecificValue {
    static Scanner sc = new Scanner(System.in);

    public static void checkArrayContainsOrNot() {
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array1 = new int[arraySize];
        System.out.println("enter array elements");
        for (int i = 0; i < arraySize; i++)
            array1[i] = sc.nextInt();
        System.out.println("give element to check");
        int element = sc.nextInt();
        boolean isContain=false;
        for(int i=0;i<arraySize;i++)
        {
            if(array1[i]==element) {
                isContain = true;
                break;
            }
        }
        if(isContain)
            System.out.println("given element is found");
        else
            System.out.println("not found");

    }
}
