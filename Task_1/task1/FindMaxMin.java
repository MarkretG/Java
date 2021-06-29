package task1;

import java.util.Scanner;

public class FindMaxMin {
    static Scanner sc=new Scanner(System.in);
    public static void findMaxMin() {
        int max,min;
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array1 = new int[arraySize];
        System.out.println("enter array elements");
        for (int i = 0; i < arraySize; i++)
            array1[i] = sc.nextInt();
        max=array1[0];
        min=array1[0];
        for(int i=0;i<arraySize;i++)
        {
            if(min>array1[i])
                min=array1[i];
            if(max<array1[i])
                max=array1[i];
        }
        System.out.println("max:" +max +"\t"+"min:" +min);

    }
}
