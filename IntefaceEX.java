interface inter1{
    void m1();
    void m2();
    
}
class A implements inter1{
    public void m1()
    {
        System.out.println("M1");
    }
    public void m2()
    {
        System.out.println("M2");
    }
}










public class IntefaceEX {
    public static void main(String[] args) {
        A a1=new A();
        a1.m1();
        a1.m2();

    }
    
}
