package task1;
import java.util.Scanner;
public class InsertElementAtPositionOnArray {
    static Scanner sc=new Scanner(System.in);
    public static void insertElement(int[] array1) {
        int arraySize=array1.length;
        System.out.println("which position you want to insert element");
        int position = sc.nextInt();
        int element=sc.nextInt();
        for(int i=arraySize;i>position;i--)
        {
              array1[i]=array1[i-1];
        }
        array1[position]=element;
        for (int i=0;i<arraySize+1;i++)
            System.out.println(array1[i]);


    }
}
