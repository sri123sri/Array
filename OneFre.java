import java.util.*;
public class OneFre
{
    public static void OneOccur(int[] arr)
    {
        int[] ans=new int[arr.length];
        for(int num:arr)
        {
          ans[num]++;
        }
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]==1)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,2,3,4,4,5,6,6};
        OneOccur(arr);
    }
}