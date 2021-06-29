package task1;
import java.util.Scanner;
public class IndexOfElement {
    static  Scanner sc=new Scanner(System.in);
    public static void findIndex() {
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array1 = new int[arraySize];
        System.out.println("enter array elements");
        for(int i=0;i<arraySize;i++)
            array1[i]=sc.nextInt();
        System.out.println("which element  index you need");
        int element=sc.nextInt();
        int i=0;
        while(i<arraySize)
        {
            if(array1[i]==element) {
                System.out.println("index of the element" + element + "is"+" " + i);
                break;
            }
            else
                i++;
        }

    }
}
