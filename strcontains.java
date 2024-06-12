public class strcontains {
    public static void main(String[] args)
    {
        String s1="Hello this is Java Programming";
        String vowels="AEIOUaeiou";
        int vc=0;
        for(int i=0;i<s1.length();i++)
        {
            if(vowels.contains("" + s1.charAt(i)));
            vc++;
        }
        System.out.println(vc);
    }
    
}
