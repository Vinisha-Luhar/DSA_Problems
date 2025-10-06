import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Length of array");
        int n = scanner.nextInt();
        int minSum=0,maxSum=0;
        long sum=0;
        int[] array = new int[n];
        long[] sumArray=new long[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    continue;
                }
                else
                {
                    sum=sum+array[j];
                }
            }
            System.out.println(sum);
            sumArray[i]=sum;
            sum=0;
        }
        long minElement=sumArray[0];
        long maxElement=sumArray[0];
        for(int i=0;i<n;i++)
        {
            if(sumArray[i]<=minElement)
            {
               minElement = sumArray[i];
            }else if (sumArray[i]>=maxElement)
            {
                maxElement = sumArray[i];
            }
        }
       
        System.out.println("Min Sum "+minElement+" Max Sum "+maxElement);
    }
}
