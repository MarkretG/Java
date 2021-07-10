package task1;
import java.util.Arrays;
public class RemoveDuplicate {
    public  static void  removeDuplicate(int[] array1) {
        Arrays.sort(array1);
        int j=1;
        for(int i=0;i<array1.length-1;i++)
        {
            if(array1[i]!=array1[i+1])
                array1[j++]=array1[i+1];
        }
        for (int i=0;i<j;i++)
            System.out.println(array1[i]);
    }
}
