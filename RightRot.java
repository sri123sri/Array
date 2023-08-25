import java.util.*;
public class RightRot
{
    public static int[] PosRightRot(int[] arr,int n)
    {
        
        int x=arr.length;
        int[] rotArr=new int[x];
        for(int i=0;i<x;i++)
        {
            int newPos=(i+x-n)%x;
            rotArr[i]=arr[newPos];
        }
        return rotArr;
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,56,7};
        int[] ans=PosRightRot(arr,2);
        System.out.println(Arrays.toString(ans));
    }
}