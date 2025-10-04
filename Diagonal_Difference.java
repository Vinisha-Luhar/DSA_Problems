import java.util.Scanner;
import java.math.*;

public class Diagonal_Difference {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row and column value for 2D array");
        int number = scanner.nextInt();
        int[][] array = new int[number][number];
        System.out.println("enter array elements "+number*number);
        for(int i=0;i<number;i++)
        {
            for(int j=0;j<number;j++)
            {
                array[i][j] = scanner.nextInt();
            }
        }
        int result = diagonalDifference(array,number);
        System.out.println(result);
    }

    static int diagonalDifference(int[][] array, int number){
        int left_diagonal=0,right_diagonal=0;
        for(int i=0;i<number;i++)
        {
            for(int j=0;j<number;j++)
            {
                if(i == j)
                {
                    left_diagonal=left_diagonal+array[i][j];
                }
                if(i+j == number-1)
                {
                    right_diagonal = right_diagonal + array[i][j];
                }
            }
        }
        return Math.abs(left_diagonal-right_diagonal);
    }
}
