package task1;
public class SumValuesOfNumericArray {
    public  static void  sumValues(int[] array1) {
        int arraySize=array1.length;
        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            sum = sum + array1[i];
        }
        System.out.println("sum values of array elements:" + sum);
    }
}
