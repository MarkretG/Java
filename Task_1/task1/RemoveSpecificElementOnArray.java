package task1;

import java.util.Scanner;

public class RemoveSpecificElementOnArray {
    static Scanner sc = new Scanner(System.in);
    public static void removeElement(int[] array1) {
        int arraySize=array1.length;
        System.out.println("which element you want to remove");
        int element = sc.nextInt();
        for(int i=0;i<arraySize;i++)
        {
            if(array1[i]==element)
            {
                int start=i;
                for (int j=start;j<arraySize;j++) {
                    if(j+1<arraySize)
                      array1[j] = array1[j + 1];
                }
                break;
            }

        }
        for (int i=0;i<arraySize-1;i++)
            System.out.println(array1[i]);


    }
}
