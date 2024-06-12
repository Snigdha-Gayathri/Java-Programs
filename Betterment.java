
import java.util.*;
abstract class Shape
{
     double area;
     Scanner sc=new Scanner(System.in);
     abstract void getInput();
     void printArea()
     {
        System.out.println("Area is: "+ area + " square units");
     }
     
}
class Circle extends Shape
{
	int radius;

	static final double pi=3.14;//general variable independent of circle
	void getInput()
	{
		
		radius=sc.nextInt();
	}
	void calcArea()
	{
		area=pi*radius*radius;
	}
	
}
class Rectangle extends Shape
{
    int length;
    int breadth;
    
    void getInput()
    {
        
        length=sc.nextInt();
        breadth=sc.nextInt();
    }
    void calcArea()
    {
        area=length*breadth;
    }
    
}
class Square extends Shape
{
    int side;
    
    void getInput()
    {
        
        side=sc.nextInt();
    }
    void calcArea()
    {
        area=side*side;
    }
    
    
}

public class Betterment
{
	public static void main(String[] args)
	{
		Circle c1=new Circle();
		c1.getInput();
		c1.calcArea();
		c1.printArea();

        Rectangle r1=new Rectangle();
        r1.getInput();
        r1.calcArea();
        r1.printArea();

        Square s1=new Square();
        s1.getInput();
        s1.calcArea();
        s1.printArea();
    }
}

