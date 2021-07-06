package task2;
public class ReverseWords {
    public static void  reverse(String s)
    {
        String[] str=s.split(" ");
        String answer="";
        for(int i=str.length-1;i>=0;i--)
           answer+=str[i]+" ";
        System.out.println(answer);

    }
}
