import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Insert_Start_Array {
    public static void main(String[] args) {
        int[] arr={20,20,30,40,0};
        int element=50;
        System.out.println(arr.length);
        if(arr.length == 0)
        {
            arr[0]=element;
        }
        else if(arr.length != 0)
        {
             for(int i=arr.length-2;i>=0;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[0]=element;
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }


        //As ArrayList
        ArrayList<Integer> arrlist=new ArrayList<>(Arrays.asList(10,20,30,40,0));
        arrlist.add(0,50);
        System.out.println(arrlist);

    }
}
