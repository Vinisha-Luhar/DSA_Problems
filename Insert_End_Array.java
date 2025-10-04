public class Insert_End_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,0};
        arr[arr.length-1]=5;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
