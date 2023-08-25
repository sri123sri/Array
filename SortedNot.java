public class SortedNot
{
    public static int ArrSort(int[] arr)
    {
        int flag=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                flag=0;
            }
            else
            {
                flag=1;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args)
    {
        int[] arr={6,5,4,3,2,1};
        int res=ArrSort(arr);
        if(res==1)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("yes");
        }
    }
}