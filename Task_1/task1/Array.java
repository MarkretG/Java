package task1;
import java.util.Scanner;
public class Array {
    static Scanner sc=new Scanner(System.in);
    public static int[] getElementsOfNumericArray()
    {
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array1 = new int[arraySize];
        System.out.println("enter array elements");
        for (int i = 0; i < arraySize; i++)
            array1[i] = sc.nextInt();

        return array1;
    }
    public static String[] getElementsOfStringArray()
    {
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        String[] array1 = new String[arraySize];
        System.out.println("enter array elements");
        sc.nextLine();
        for (int i = 0; i < arraySize; i++)
            array1[i] = sc.nextLine();

        return array1;
    }
}
