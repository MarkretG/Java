package task1;

import java.util.Scanner;

public class SumOfTwoElementEqualToGivenValue {
    static Scanner sc=new Scanner(System.in);
    public static void sumOfTwoElement(int[] array1) {
        int arraySize=array1.length;
        int flag=0;
        System.out.println("enter target value");
        int targetValue=sc.nextInt();
        for(int i=0;i<arraySize;i++)
        {
            for(int j=i+1;j<arraySize;j++)
            {
                if(array1[i]+array1[j]==targetValue) {

                    System.out.println("{" + array1[i] + "," + array1[j] + "}");
                    flag++;
                }
            }
        }
        if(flag==0)
            System.out.println("sum of two elements no equal to target value ");
    }
}
