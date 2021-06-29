package task1;

import java.util.Scanner;

public class RemoveSpecificElementOnArray {
    static Scanner sc = new Scanner(System.in);

    public static void removeElement() {
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array3 = new int[arraySize];
        System.out.println("enter array elements");
        for (int i = 0; i < arraySize; i++)
            array3[i] = sc.nextInt();
        System.out.println("which element you want to remove");
        int element = sc.nextInt();
        for(int i=0;i<arraySize;i++)
        {
            if(array3[i]==element)
            {
                int start=i;
                for (int j=start;j<arraySize;j++) {
                    if(j+1<arraySize)
                      array3[j] = array3[j + 1];
                }
                break;
            }

        }
        for (int i=0;i<arraySize-1;i++)
            System.out.println(array3[i]);


    }
}
