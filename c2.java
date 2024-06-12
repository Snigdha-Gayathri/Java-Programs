public class c2 {
    public static void main(String[]args)
    {
        String s="Hello World";
        //for(char eachchar:s.toCharArray())
        //{
        //    System.out.println(eachchar);
        //}
        char[] arr=new char[s.length()];
        int i=0;
        for(int j=0;j<s.length();j++)
        {
            arr[i]= s.charAt(j);
            i++;
        }
        System.out.println(arr);
    }
    
}
