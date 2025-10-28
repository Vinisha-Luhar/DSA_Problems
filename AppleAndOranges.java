import java.util.ArrayList;
import java.util.Scanner;

public class AppleAndOranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the respective values of S and T");
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        System.out.println("Enter the values for a and b");
        int a = scanner.nextInt();
        int b= scanner.nextInt();

        System.out.println("Enter the total number of apples and oranges on tree");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int applecount=0;
        int orangecount=0;

        System.out.println("Enter the respective values of fallen apples");
        for(int i=0;i<m;i++)
        {
            int distance = scanner.nextInt();
            int fallPosition = a+distance;
            if(fallPosition >= s && fallPosition <= t)
            {
                applecount++;
            }
        }
        
        System.out.println("Enter the respective values of fallen oranges");
        for(int i=0;i<n;i++)
        {
            int distance = scanner.nextInt();
            int fallPosition = b+distance;
            if(fallPosition >= s && fallPosition <= t)
            {
                orangecount++;
            }
        }
        
        System.out.println(applecount);
        System.out.println(orangecount);
    }
}
