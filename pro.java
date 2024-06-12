import java.util.*;
public class pro
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] arr=new int[n];
         int sum=0,c=0;
         double avg;
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++)
         {
             sum+=arr[i];
         }
         avg=(double) sum/n;
         for(int i=0;i<n;i++)
         {
             if(arr[i]==avg)
             {
                 c++;
                 
             }
         }
        if(c!=0)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}