package task1;
public class CommonElementBetweenTwoStringArrays {
    public static void findCommonElement(String[] array1,String[] array2)
    {
        int array1Size=array1.length;
        int array2Size=array2.length;
        System.out.println("common element");
        for(int i=0;i<array1Size;i++)
        {
            for(int j=0;j<array2Size;j++)
            {
                if(array1[i].equals(array2[j]))
                    System.out.println(array1[i]);
            }
        }
    }
}
