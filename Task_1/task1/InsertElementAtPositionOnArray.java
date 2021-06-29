package task1;
import java.util.Scanner;
public class InsertElementAtPositionOnArray {
    static Scanner sc=new Scanner(System.in);
    public static void insertElement() {
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array4 = new int[arraySize+1];
        System.out.println("enter array elements");
        for (int i = 0; i < arraySize; i++)
            array4[i] = sc.nextInt();
        System.out.println("which position you want to insert element");
        int position = sc.nextInt();
        int element=sc.nextInt();
        for(int i=arraySize;i>position;i--)
        {
              array4[i]=array4[i-1];
        }
        array4[position]=element;
        for (int i=0;i<arraySize+1;i++)
            System.out.println(array4[i]);


    }
}
