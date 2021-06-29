package task1;
import java.util.Scanner;
import java.util.Scanner;
public class SumValuesOfNumericArray {
   static Scanner sc = new Scanner(System.in);
    public  static void  sumValues() {
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array2 = new int[arraySize];
        System.out.println("enter array elements");
        for (int i = 0; i < arraySize; i++)
            array2[i] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            sum = sum + array2[i];
        }
        System.out.println("sum values of array elements:" + sum);
    }
}
