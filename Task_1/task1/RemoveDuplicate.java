package task1;

import java.util.Scanner;

public class RemoveDuplicate {
    static Scanner sc = new Scanner(System.in);
    public  static void  removeDuplicate() {
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array1 = new int[arraySize];
        System.out.println("enter array elements");
        for (int i = 0; i < arraySize; i++)
            array1[i] = sc.nextInt();
        for (int i = 0; i < arraySize; i++) {
            if(array1[i]!=-1)
            {
                for (int j = i + 1; j < arraySize; j++)
                {
                    if (array1[i] == array1[j])
                        array1[j] ='0';
                }
            }

        }
        for(int i=0;i<arraySize;i++)
        {

            if(array1[i]!='0')
                System.out.println(array1[i]);
        }
    }
}
