package task2;
import java.util.Arrays;
public class SecondLargest {
    public  static  void secondLargest(int[] array)
    {
        Arrays.sort(array);
        System.out.println("second largest:"+(array[array.length-2]));
    }
}
