import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Array Size");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Input Array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        SortColors.sortColors(arr);
    }

     public static void sortColors(int[] nums) {
        int n = nums.length;
        int low=0,mid=0,high=n-1;
        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                SortColors.swap(nums,low,mid);
                mid++;
                low++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                SortColors.swap(nums,high,mid);
                high--;
            }
        }
    }

    public static void swap(int[] nums,int i,int j)
    {
        int temp;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
