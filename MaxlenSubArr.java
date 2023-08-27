import java.util.*;
public class MaxlenSubArr
{
    public static int MaxLen(int[] arr,int sum)
    {
        int maxlen=0;
        for(int i=0;i<arr.length;i++)
        {
          int sum1=0;
          for(int j=i;j<arr.length;j++)
          {
            sum1=sum1+arr[j];
            if(sum1==sum)
            {
                maxlen=Math.max(maxlen,j-i+1);
            }
          }
        }
        return maxlen;
    }
    public static void main(String[] args)
    {
        int[] arr={1,4,5,6,9,3};
        int sum=10;
        int ans=MaxLen(arr,sum);
        System.out.print(ans);
    }
    
}