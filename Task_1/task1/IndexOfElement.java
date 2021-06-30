package task1;
import java.util.Scanner;
import java.util.Arrays;
public class IndexOfElement {
    static  Scanner sc=new Scanner(System.in);
    public static void findIndex(int[] array1) {
        int arraySize=array1.length;
        System.out.println("which element  index you need");
        int element=sc.nextInt();
        System.out.println("found at index"+Arrays.binarySearch(array1,element));

    }
}
