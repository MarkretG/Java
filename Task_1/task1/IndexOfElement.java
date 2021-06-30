package task1;
import java.util.Scanner;
public class IndexOfElement {
    static  Scanner sc=new Scanner(System.in);
    public static void findIndex(int[] array1) {
        int arraySize=array1.length;
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
