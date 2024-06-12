import java.util.*;
public class task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Rows=3;
        int Columns=4;

        // int[][] arr=new int[Rows][Columns];
        // for(int i=0;i<Rows;i++)
        // {
        //     for(int j=0;j<Columns;j++)
        //     {
        //         //arr[i][j]=sc.nextInt();
        //     }
        // }
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int k=0;k<n;k++)
        {
            a[k]=sc.nextInt();
        }
        for(int k:a)
        {
            System.out.print(k+" ");
        }
````
    }

    
}
