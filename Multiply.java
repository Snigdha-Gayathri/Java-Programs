 class ULFA {
    static void mul(int a, int b)
    {
        System.out.println(a*b);
    }
    static void mul(int a, int b,int c)
    {
        System.out.println(a*b*c);
    }
    static void mul(int a, double b)
    {
        System.out.println(a*b);
    }
    static void mul(int [] arr)
    {
        int pro=0;
        for(int i=0;i<arr.length;i++)
        {
            pro*=arr[i];
        }
        System.out.println(pro);
    }
}
public class Multiply
{
    public static void main(String[] args)
    {
        ULFA.mul(9,2);
        ULFA.mul(1,9,2);
        ULFA.mul(9,2.00);
        ULFA.mul(new int[] {1,2,3,3});

    }
}