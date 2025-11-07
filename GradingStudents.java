import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the total number of students for which you want to round grades");
        int n=scanner.nextInt();
        int[] grades=new int[n];
        int diff=0;
        List<Integer> result = new ArrayList<>();
        System.out.println("Type grades from 0 to 100");
        for(int i=0;i<n;i++)
        {
            grades[i]=scanner.nextInt();
            if(grades[i]<0 || grades[i]>100)
            {
                System.out.println("Invalid grade");
                System.exit(0);
            }
            else
            {
                    
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            
        }
        System.out.println(result);
    }
}
