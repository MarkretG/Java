package task1;
import java.util.Scanner;
public class FindNumberOfOddAndEven {
    static int evenCount=0,oddCount=0;
    static Scanner sc=new Scanner(System.in);
    public static void findMaxMinCount(int[] array1) {
        int arraySize=array1.length;
        for(int i=0;i<arraySize;i++)
        {
            if(array1[i]%2==0)
                evenCount++;
            if(array1[i]%2!=0)
                oddCount++;

        }
        System.out.println("odd numbers:"+oddCount+"\n"+"even numbers:"+evenCount);
    }

}
