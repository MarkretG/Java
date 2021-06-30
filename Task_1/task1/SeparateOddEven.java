package task1;
public class SeparateOddEven {
    public static void separateEvenOdd(int[] array1) {
       int arraySize=array1.length;
        for(int i=0;i<arraySize;i++) {
            if(array1[i]%2==0)
                System.out.println(array1[i]);
        }
        for (int j=0;j<arraySize;j++)
        {
            if (array1[j]%2!=0)
                System.out.println(array1[j]);
        }

    }
}
