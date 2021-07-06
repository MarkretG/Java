package task2;
import java.util.Arrays;
public class SeparateZerosAndOnes {
    public static void separateZerosAndOnes(int[] array)
    {
        Arrays.sort(array);
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }
}
