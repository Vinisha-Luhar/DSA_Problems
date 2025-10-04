import java.util.Scanner;

public class Reverse_String {
    public static void main(String args[])
    {
        System.out.println("Enter a string to reverse");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String result=reverse_String(string);
        System.out.println(result);
    } 
    
    public static String reverse_String(String s)
    {
        String result="";
        for(int i=s.length()-1;i>=0;i--)
        {
            result=result+s.charAt(i);
        }
        return result;
    }
}
