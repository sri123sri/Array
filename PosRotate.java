import java.util.*;
public class PosRotate
{
    public static int[] Positional(int[] arr,int n)
    {
        int[] RotArr=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int Pos=(i+n)%arr.length;
            RotArr[i]=arr[Pos];
        }
        return RotArr;
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6};
        int[] ans=Positional(arr,1);
        System.out.println(Arrays.toString(ans));

    }
}