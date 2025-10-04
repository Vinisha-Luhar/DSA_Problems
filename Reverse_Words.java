import java.util.Scanner;

public class Reverse_Words {
    public static void main(String args[])
    {
        System.out.println("Enter Your Statement which you want to reverse");
        Scanner scanner=new Scanner(System.in);
        String statement = scanner.nextLine();
        String result=reverseWordString(statement);
        System.out.println(result);
    }

    public static String reverseWordString(String s)
    {
        String result="";
        int end=s.length();
        for(int i=end-1;i>=0;i--)
        {
            if(s.charAt(i) == ' ')
            {
                result = result + s.substring(i+1, end) + " ";
                end=i;
            }
        }
        result = result + s.substring(0, end);
        return result;
    }
}
