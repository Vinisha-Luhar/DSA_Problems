import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int maxElement = arr[0];
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] >= maxElement)
            {
                maxElement = arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i] == maxElement)
            {
                count++;
            }
        }
        System.out.println(maxElement);
        System.out.println(count);
    }
}
