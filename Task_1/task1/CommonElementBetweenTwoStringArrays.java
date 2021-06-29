package task1;

import java.util.Scanner;

public class CommonElementBetweenTwoStringArrays {
    static Scanner sc=new Scanner(System.in);
    public static void findCommonElement()
    {
        System.out.println("enter array size");
        int array1Size = sc.nextInt();
        int array2Size=sc.nextInt();
        String[] array1 = new String[array1Size];
        String[] array2=new  String[array1Size];
        System.out.println("enter array1 elements");
        sc.nextLine();
        for (int i = 0; i < array1Size; i++)
            array1[i] = sc.nextLine();
        System.out.println("enter array2 elements");
        for(int i=0;i<array2Size;i++)
           array2[i]=sc.nextLine();
        System.out.println("common element");
        for(int i=0;i<array1Size;i++)
        {
            for(int j=0;j<array2Size;j++)
            {
                if(array1[i].equals(array2[j]))
                    System.out.println(array1[i]);
            }
        }
    }
}
