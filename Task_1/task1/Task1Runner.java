package task1;
import java.util.Scanner;
public class Task1Runner {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1.find index" + "\n" + "2.sum values" + "\n" + "3.remove element"+"\n"+"4.Insert element"+"\n"+"5.Check given element present or not"+"\n"+"6.Find max min"+"\n"+"7.Two string array common elements"+"\n"+"8.two numeric array common elements"+"\n"+"9.remove duplicate"+"\n"+"10.find odd and even count"+"\n"+"11.find Average"+"\n"+"12.find sum of two elements equal to target value"+"\n"+"13.reverse array"+"\n"+"14.Separate even first odd next"+"\n"+"15.numeric sort"+"\n"+"16.find leaders"+"\n"+"17.exit");
        while (true) {
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    IndexOfElement.findIndex();
                    break;
                case 2:
                    SumValuesOfNumericArray.sumValues();
                    break;
                case 3:
                    RemoveSpecificElementOnArray.removeElement();
                    break;
                case 4:
                    InsertElementAtPositionOnArray.insertElement();
                    break;
                case 5:
                    CheckArrayContainSpecificValue.checkArrayContainsOrNot();
                    break;
                case 6:
                    FindMaxMin.findMaxMin();
                    break;
                case 7:
                    CommonElementBetweenTwoStringArrays.findCommonElement();
                    break;
                case 8:
                    CommonElementBetweenTwoNumericArray.findCommonElement();
                    break;
                case 9:
                    RemoveDuplicate.removeDuplicate();
                    break;
                case 10:
                    FindNumberOfOddAndEven.findMaxMinCount();
                    break;
                case 11:
                    FindAverageValueExceptMaxMin.findAverage();
                    break;
                case 12:
                    SumOfTwoElementEqualToGivenValue.sumOfTwoElement();
                    break;
                case 13:
                    ReverseArray.reverseArray();
                    break;
                case 14:
                    SeparateOddEven.separateEvenOdd();
                    break;
                case 15:
                    NumericArraySort.sortArray();
                    break;
                case 16:
                    FindLeadersInArray.findLeaders();
                    break;
                case 17:
                    System.exit(0);


            }

        }
    }
}
