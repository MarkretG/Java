package task1;
import java.util.Scanner;
public class InsertElementAtPositionOnArray {
    static Scanner sc=new Scanner(System.in);
    public static void insertElement(int[] array1) {
        int arraySize=array1.length;
        int[] newArray=new int[arraySize+1];
        System.out.println("which position you want to insert element");
        int position = sc.nextInt();
        System.out.println("which element you want to insert");
        int element=sc.nextInt();
        for(int i=0;i<=arraySize;i++)
        {
            if(position>i)
                newArray[i]=array1[i];
            else if(position==i)
                newArray[i]=element;
            else
                newArray[i]=array1[i-1];
        }
        for (int i=0;i<newArray.length;i++)
            System.out.println(newArray[i]);


    }
}
