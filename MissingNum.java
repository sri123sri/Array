import java.util.*;
public class MissingNum
{
  public static void MisNum(int[] arr,int n)
  {
    int diff=1;
    for(int i=0;i<n;i++)
    {
      if((arr[i]-i)!=diff)
      {
        while(diff<arr[i]-i)
        {
          System.out.print(i+diff+" ");
          diff++;
        }
      }
    }
  }
  public static void main(String[] args)
  {
    int[] arr={2,3,5,7,8,9};
    int n=arr.length;
    MisNum(arr,n);
  }
}