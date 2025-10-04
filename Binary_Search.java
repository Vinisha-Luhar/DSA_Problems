import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter which element you want to search");
        int element = scanner.nextInt();
        Binary_Search bs= new Binary_Search();
        System.out.println(bs.binarySearchAlgorithm(arr, n, element));

    }

    public int binarySearchAlgorithm(int[] arr,int n,int key)
    {
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end)
        {
            if(arr[mid] == key)
            {
                return mid;
            }
            if(key>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        return -1;
    }
}
