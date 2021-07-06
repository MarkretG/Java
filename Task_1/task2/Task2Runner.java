package task2;
import java.util.Scanner;
public class Task2Runner {
    static Scanner sc=new Scanner(System.in);
    static int[] inputArray;
    public static void main(String[] args) {
        System.out.println("1.second largest"+"\n"+"2.separate os and 1s"+"\n"+"3.AlternateSort"+"\n"+"4.reverse string"+"\n"+"5.reverse words"+"\n"+"6.Convert array to arraylist"+"\n"+"7.pojo class property"+"\n"+"8.constructor overloaded"+"\n"+"9.Define enum"+"\n"+"10.file creation"+"\n"+"11.exit");
        while (true)
        {
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    inputArray=GetArrayElements.getElementsOfNumericArray();
                    SecondLargest.secondLargest(inputArray);
                    break;
                case 2:
                    inputArray=GetArrayElements.getElementsOfNumericArray();
                    SeparateZerosAndOnes.separateZerosAndOnes(inputArray);
                    break;
                case 3:
                    inputArray=GetArrayElements.getElementsOfNumericArray();
                    AlternateSort.alternateSort(inputArray);
                    break;
                case 4:
                    System.out.println("enter the string");
                    sc.nextLine();
                    String str1=sc.nextLine();
                    ReverseString.reverse(str1);
                    break;
                case 5:
                    System.out.println("enter the sentence");
                    sc.nextLine();
                    String str2=sc.nextLine();
                    ReverseWords.reverse(str2);
                    break;
                case 6:
                    inputArray=GetArrayElements.getElementsOfNumericArray();
                    ConvertArrayToArrayList.convertToArrayList(inputArray);
                    break;
                case 7:
                    PoJoClassForStudent obj=new PoJoClassForStudent("vino",171517,"17cs020",21,"CSE");
                    System.out.println(obj.toString());
                    break;
                case 8:
                    ConstructorOverloadedForUser obj1=new ConstructorOverloadedForUser("kani");
                    ConstructorOverloadedForUser obj2=new ConstructorOverloadedForUser("vino","System1");
                    ConstructorOverloadedForUser obj3=new ConstructorOverloadedForUser("moni","1234moni",21);
                    System.out.println(obj1.toString());
                    System.out.println(obj2.toString());
                    System.out.println(obj3.toString());
                    break;
                case 9:
                    for (DefineEnum.RainbowColor r: DefineEnum.RainbowColor.values())
                        System.out.println("Color code of"+" "+r+" "+"is"+" "+r.value);
                    break;
                case 10:
                    System.out.println("enter file name");
                    sc.nextLine();
                    String fileName=sc.nextLine();
                    FileCreation.fileCreation(fileName);
                    break;
                case 11:
                    System.exit(0);
            }
        }

    }
}
