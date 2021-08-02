package task1;
public class SeparateOddEven {
    public static void separateEvenOdd(int[] array1) {
       int[] newArray=new int[array1.length];
        int evenCount=0,n=0;
        for(int i=0;i<array1.length;i++) 
        {
            if(array1[i]%2==0)
               evenCount++;      
        }
        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]%2==0)
                newArray[n++]=array1[i];
            else
                newArray[evenCount++]=array1[i];
        }
        for (int j=0;j<evenCount;j++)
           System.out.println(newArray[j]);
        

    }
}
