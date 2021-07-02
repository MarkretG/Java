package task1;
public class SeparateOddEven {
    public static void separateEvenOdd(int[] array1) {
       int arraySize=array1.length;
        int n=0;
        for(int i=0;i<arraySize;i++) {
            if(array1[i]%2==0)
             {
               int temp=array1[n];
               array1[n++]=array1[i];
               array1[i]=temp;
            }
        }
        for (int j=0;j<arraySize;j++)
        {
           System.out.println(array1[j]);
        }

    }
}
