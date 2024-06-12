import java.util.Scanner;
public class StringArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
String arr[]=new String[p];
int i;
for(i=0;i<p;i++)
{
arr[i]=sc.nextLine();
}
for(i=0;i<p;i++)
{
System.out.println(arr[i] + ",");
}
}
}
