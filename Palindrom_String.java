import java.util.Scanner;

class Palindrom_String
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String to check if it is Palindrom or not");
        String s=scanner.nextLine();
        if(isPalindrom(s))
        {
            System.out.println("String is Palindrom");
        }
        else
        {
            System.out.println("String is not Palindrom");
        }
    }

    public static boolean isPalindrom(String s)
    {
        int i=0,j=s.length()-1,flag=0;
        while(i<=j && flag==0)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                flag=1;
            }
            else
            {
                i++;
                j--;
            }
        }
        if(flag == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}