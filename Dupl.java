import java.util.*;
public class Dupl
{
  public static int[] RemoveDupl(int[] arr)
  {
    int i=0;
    int j=0;
    while(j<arr.length)
    {
        if(arr[i]==arr[j])
        {
            j++;
        }
        else
        {
           i++;
           arr[i]=arr[j];
           j++;
           
        }
    }
    int[] result = Arrays.copyOf(arr, i + 1);
    return result;
  }
  public static void main(String[] args)
  {
    int[] arr={1,2,2,3,4,5};
    int[] ans=RemoveDupl(arr);
    System.out.println(Arrays.toString(ans));
  }
}