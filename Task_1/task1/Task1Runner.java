package task1;
import java.util.Scanner;
public class Task1Runner {
    static Scanner sc = new Scanner(System.in);
    static  int[] InputArray;
    public static void main(String[] args) {
        System.out.println("1.find index" + "\n" + "2.sum values" + "\n" + "3.remove element"+"\n"+"4.Insert element"+"\n"+"5.Check given element present or not"+"\n"+"6.Find max min"+"\n"+"71.Two string array common elements"+"\n"+"72.two numeric array common elements"+"\n"+"8.remove duplicate"+"\n"+"9.find odd and even count"+"\n"+"10.find Average"+"\n"+"11.find sum of two elements equal to target value"+"\n"+"12.reverse array"+"\n"+"13.Separate even first odd next"+"\n"+"14.numeric sort"+"\n"+"15.find leaders"+"\n"+"16.exit");
        while (true) {
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    InputArray=Array.getElementsOfNumericArray();
                    IndexOfElement.findIndex(InputArray);
                    break;
                case 2:
                    InputArray=Array.getElementsOfNumericArray();
                    SumValuesOfNumericArray.sumValues(InputArray);
                    break;
                case 3:
                    InputArray=Array.getElementsOfNumericArray();
                    RemoveSpecificElementOnArray.removeElement(InputArray);
                    break;
                case 4:
                    InputArray=Array.getElementsOfNumericArray();
                    InsertElementAtPositionOnArray.insertElement(InputArray);
                    break;
                case 5:
                    InputArray=Array.getElementsOfNumericArray();
                    CheckArrayContainSpecificValue.checkArrayContainsOrNot(InputArray);
                    break;
                case 6:
                    InputArray=Array.getElementsOfNumericArray();
                    FindMaxMin.findMaxMin(InputArray);
                    break;
                case 71:
                    String[] array1=Array.getElementsOfStringArray();
                    String[] array2=Array.getElementsOfStringArray();
                    CommonElementBetweenTwoStringArrays.findCommonElement(array1,array2);
                    break;
                case 72:
                   int[] array3=Array.getElementsOfNumericArray();
                   int[] array4=Array.getElementsOfNumericArray();
                    CommonElementBetweenTwoNumericArray.findCommonElement(array3,array4);
                    break;
                case 8:
                    InputArray=Array.getElementsOfNumericArray();
                    RemoveDuplicate.removeDuplicate(InputArray);
                    break;
                case 9:
                    InputArray=Array.getElementsOfNumericArray();
                    FindNumberOfOddAndEven.findMaxMinCount(InputArray);
                    break;
                case 10:
                    InputArray=Array.getElementsOfNumericArray();
                    FindAverageValueExceptMaxMin.findAverage(InputArray);
                    break;
                case 11:
                    InputArray=Array.getElementsOfNumericArray();
                    SumOfTwoElementEqualToGivenValue.sumOfTwoElement(InputArray);
                    break;
                case 12:
                    InputArray=Array.getElementsOfNumericArray();
                    ReverseArray.reverseArray(InputArray);
                    break;
                case 13:
                    InputArray=Array.getElementsOfNumericArray();
                    SeparateOddEven.separateEvenOdd(InputArray);
                    break;
                case 14:
                    InputArray=Array.getElementsOfNumericArray();
                    NumericArraySort.sortArray(InputArray);
                    break;
                case 15:
                    InputArray=Array.getElementsOfNumericArray();
                    FindLeadersInArray.findLeaders(InputArray);
                    break;
                case 16:
                    System.exit(0);


            }

        }
    }
}
