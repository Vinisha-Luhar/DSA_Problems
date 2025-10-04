import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=scanner.nextInt();
        int[] arr = new int[n];
        int negativeNumbers=0,positiveNumbers=0,zeroNumbers=0;
        System.out.println("Enter "+n+" Array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                negativeNumbers++;
            }
            else if(arr[i]>0)
            {
                positiveNumbers++;
            }
            else
            {
                zeroNumbers++;
            }
        }
        String ratioNegative = String.format("%.6f", (double)negativeNumbers/n);
        String ratioPositive = String.format("%.6f", (double)positiveNumbers/n);
        String ratioZero = String.format("%.6f", (double)zeroNumbers/n);
        System.out.println(ratioPositive);
        System.out.println(ratioNegative);
        System.out.println(ratioZero);
    }
}