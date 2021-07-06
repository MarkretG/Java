package task2;
import java.util.*;

public class ConvertArrayToArrayList {
    public static void convertToArrayList(int[] array1)
    {
       List<Integer> list=new ArrayList<Integer>();
       for (Integer i:array1)
         list.add(i);
        System.out.println(list);
    }
}
