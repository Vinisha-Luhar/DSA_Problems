import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLeaders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size");
        int n=scanner.nextInt();
        System.out.println("Input Array Elements");
        int arr[] = new int[n];
        int max;
        ArrayList<Integer> maxIntegers=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        max=arr[n-1];
        maxIntegers.add(max);
        for(int i=n-2;i>=0;i--)
        {
            if(max<=arr[i])
            {
                max=arr[i];
                maxIntegers.add(max);
            }
        }
        Collections.reverse(maxIntegers);
        System.out.println(maxIntegers);
    }
}
