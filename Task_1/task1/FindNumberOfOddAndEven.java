package task1;
public class FindNumberOfOddAndEven {
    static int evenCount=0,oddCount=0;
    public static void findMaxMinCount(int[] array1) {
        int arraySize=array1.length;
        for(int i=0;i<arraySize;i++)
        {
            if(array1[i]%2==0)
                evenCount++;
            else
                oddCount++;

        }
        System.out.println("odd numbers:"+oddCount+"\n"+"even numbers:"+evenCount);
    }

}
