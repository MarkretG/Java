package task1;
import java.util.Scanner;
public class NumericArraySort {
    static Scanner sc=new Scanner(System.in);
    public static void sortArray(int[] array1) {
        int arraySize=array1.length;
        int temp;
        // Arrays.sort(array1);
        for (int i=0;i<arraySize;i++)
        {
            for(int j=i+1;j<arraySize;j++)
            {
                if(array1[i]>array1[j])
                {
                    temp=array1[i];
                    array1[i]=array1[j];
                    array1[j]=temp;
                }
            }
        }

        for(int i=0;i<arraySize;i++)
            System.out.println(array1[i]);

    }
}
