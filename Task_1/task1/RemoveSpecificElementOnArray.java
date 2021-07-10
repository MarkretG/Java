package task1;
import java.util.Scanner;
public class RemoveSpecificElementOnArray {
    static Scanner sc = new Scanner(System.in);
    public static void removeElement(int[] array1) {
        System.out.println("which element you want to remove");
        int element = sc.nextInt();
        int j=0;
        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]!=element)
               array1[j++]=array1[i];       
        }
        for (int i=0;i<j;i++)
            System.out.println(array1[i]);


    }
}
