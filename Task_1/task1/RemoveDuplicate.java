package task1;
import java.util.Arrays;
public class RemoveDuplicate {
    public  static void  removeDuplicate(int[] array1) {
        int arraySize=array1.length;
        Arrays.sort(array1);
        int j=0;
        for(int i=0;i<arraySize-1;i++)
        {
            if(array1[i]!=array1[i+1])
                array1[j++]=array1[i];
        }
        array1[j++]=array1[arraySize-1];
        for (int i=0;i<j;i++)
            System.out.println(array1[i]);
    }
}
