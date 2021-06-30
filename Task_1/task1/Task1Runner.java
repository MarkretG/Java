package task1;
import java.util.Scanner;
public class Task1Runner {
    static Scanner sc = new Scanner(System.in);
    static  int[] inputArray;
    public static void main(String[] args) {
        System.out.println("1.find index" + "\n" + "2.sum values" + "\n" + "3.remove element"+"\n"+"4.Insert element"+"\n"+"5.Check given element present or not"+"\n"+"6.Find max min"+"\n"+"71.Two string array common elements"+"\n"+"72.two numeric array common elements"+"\n"+"8.remove duplicate"+"\n"+"9.find odd and even count"+"\n"+"10.find Average"+"\n"+"11.find sum of two elements equal to target value"+"\n"+"12.reverse array"+"\n"+"13.Separate even first odd next"+"\n"+"14.numeric sort"+"\n"+"15.find leaders"+"\n"+"16.exit");
        while (true) {
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    inputArray=GetArray.getElementsOfNumericArray();
                    IndexOfElement.findIndex(inputArray);
                    break;
                case 2:
                    inputArray=GetArray.getElementsOfNumericArray();
                    SumValuesOfNumericArray.sumValues(inputArray);
                    break;
                case 3:
                    inputArray=GetArray.getElementsOfNumericArray();
                    RemoveSpecificElementOnArray.removeElement(inputArray);
                    break;
                case 4:
                    inputArray=GetArray.getElementsOfNumericArray();
                    InsertElementAtPositionOnArray.insertElement(inputArray);
                    break;
                case 5:
                    inputArray=GetArray.getElementsOfNumericArray();
                    CheckArrayContainSpecificValue.checkArrayContainsOrNot(inputArray);
                    break;
                case 6:
                    inputArray=GetArray.getElementsOfNumericArray();
                    FindMaxMin.findMaxMin(inputArray);
                    break;
                case 71:
                    String[] array1=GetArray.getElementsOfStringArray();
                    String[] array2=GetArray.getElementsOfStringArray();
                    CommonElementBetweenTwoStringArrays.findCommonElement(array1,array2);
                    break;
                case 72:
                   int[] array3=GetArray.getElementsOfNumericArray();
                   int[] array4=GetArray.getElementsOfNumericArray();
                    CommonElementBetweenTwoNumericArray.findCommonElement(array3,array4);
                    break;
                case 8:
                    inputArray=GetArray.getElementsOfNumericArray();
                    RemoveDuplicate.removeDuplicate(inputArray);
                    break;
                case 9:
                    inputArray=GetArray.getElementsOfNumericArray();
                    FindNumberOfOddAndEven.findMaxMinCount(inputArray);
                    break;
                case 10:
                    inputArray=GetArray.getElementsOfNumericArray();
                    FindAverageValueExceptMaxMin.findAverage(inputArray);
                    break;
                case 11:
                    inputArray=GetArray.getElementsOfNumericArray();
                    SumOfTwoElementEqualToGivenValue.sumOfTwoElement(inputArray);
                    break;
                case 12:
                    inputArray=GetArray.getElementsOfNumericArray();
                    ReverseArray.reverseArray(inputArray);
                    break;
                case 13:
                    inputArray=GetArray.getElementsOfNumericArray();
                    SeparateOddEven.separateEvenOdd(inputArray);
                    break;
                case 14:
                    inputArray=GetArray.getElementsOfNumericArray();
                    NumericArraySort.sortArray(inputArray);
                    break;
                case 15:
                    inputArray=GetArray.getElementsOfNumericArray();
                    FindLeadersInArray.findLeaders(inputArray);
                    break;
                case 16:
                    System.exit(0);


            }

        }
    }
}
