package task1;

import java.util.Scanner;

public class FindNumberOfOddAndEven {
    static int evenCount=0,oddCount=0;

    static Scanner sc=new Scanner(System.in);
    public static void findMaxMinCount() {
        int max, min;
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array1 = new int[arraySize];
        System.out.println("enter array elements");
        for (int i = 0; i < arraySize; i++)
            array1[i] = sc.nextInt();
        for(int i=0;i<arraySize;i++)
        {
            if(array1[i]%2==0)
                evenCount++;
            if(array1[i]%2!=0)
                oddCount++;

        }
        System.out.println("odd numbers:"+oddCount+"\n"+"even numbers:"+evenCount);
    }

}
