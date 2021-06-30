package task1;
import java.util.Scanner;
public class FindMaxMin {
    static Scanner sc=new Scanner(System.in);
    public static void findMaxMin(int[] array1) {
        int arraySize=array1.length;
        int max,min;
        max=array1[0];
        min=array1[0];
        for(int i=0;i<arraySize;i++)
        {
            if(min>array1[i])
                min=array1[i];
            if(max<array1[i])
                max=array1[i];
        }
        System.out.println("max:" +max +"\t"+"min:" +min);

    }
}
