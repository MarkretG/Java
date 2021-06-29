package task1;

import java.util.Scanner;

public class FindLeadersInArray {
    static Scanner sc = new Scanner(System.in);
    public static void findLeaders() {
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array1 = new int[arraySize];
        System.out.println("enter array elements");
        for (int i = 0; i < arraySize; i++)
            array1[i] = sc.nextInt();
        for(int i=0;i<arraySize;i++)
        {
            int flag=0;
            for(int j=i+1;j<arraySize;j++)
            {
                if(array1[i]>array1[j])
                {
                    flag=1;
                }
                else {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                System.out.println(array1[i]);

        }
    }
}
