package task1;
import java.util.Scanner;
public class FindLeadersInArray {
    static Scanner sc = new Scanner(System.in);
    public static void findLeaders(int[] array1) {
        int arraySize=array1.length;
        for(int i=0;i<arraySize;i++)
        {
            int flag=0;
            for(int j=i+1;j<arraySize;j++)
            {
                if(array1[i]>array1[j])
                    flag=1;
                else {
                    flag=0;
                    break;
                }
            }
            if(flag==1) System.out.println(array1[i]);

        }
    }
}
