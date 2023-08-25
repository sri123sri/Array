import java.util.*;
public class RightRotate1
{
    public static void reverse(int[] arr,int start,int end)
    {
       while(start<=end)
       {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
       }
    }
    public static void RightRot(int[] arr,int k)
    {
        int n=arr.length;
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6};
        RightRot(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    
}