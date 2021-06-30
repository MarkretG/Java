package task1;
import java.util.Scanner;
import java.util.Scanner;
public class SumValuesOfNumericArray {
   static Scanner sc = new Scanner(System.in);
    public  static void  sumValues(int[] array1) {
        int arraySize=array1.length;
        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            sum = sum + array1[i];
        }
        System.out.println("sum values of array elements:" + sum);
    }
}
