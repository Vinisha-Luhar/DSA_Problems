import java.util.Scanner;

public class NumberLineJumps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for x1,v1 and x2,v2");
        int x1=scanner.nextInt();
        int v1=scanner.nextInt();
        int x2=scanner.nextInt();
        int v2=scanner.nextInt();
        String result = "";
        if(x1 < x2 && v1<=v2)
        {
            result = "NO";
        }
        else if((x2-x1)%(v1-v2)==0)
        {
            result = "YES";
        }
        else
        {
            result = "NO";
        }
        System.out.println(result);
    }
}
