package task2;
import java.util.Arrays;
public class AlternateSort {
    public static  void alternateSort(int[] array)
    {
        Arrays.sort(array);
        int max=array.length-1,min=0;
        for(int i=0;i<array.length;i++)
        {
            if(i%2!=0)
                System.out.println(array[min++]);
            else
                System.out.println(array[max--]);
        }
    }
}
