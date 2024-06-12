
import java.util.*;
class Circle
{
	int radius;
	double area;//instance variables describing a circle
	static final double pi=3.14;//general variable independent of circle
	void getRadius()
	{
		Scanner sc=new Scanner(System.in);
		radius=sc.nextInt();
	}
	void calcArea()
	{
		area=pi*radius*radius;
	}
	void printArea()
	{
		System.out.println("The area of the circle is: " + area + " square units");
	}
}
class Rectangle{
    int length;
    int breadth;
    double area;
    void getValues()
    {
        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        breadth=sc.nextInt();
    }
    void calcArea()
    {
        area=length*breadth;
    }
    void printArea()
    {
        System.out.println("The area of the rectangle is:" + area + " square units");
    }
}
class Square
{
    int side;
    double area;
    void getValues()
    {
        Scanner sc=new Scanner(System.in);
        side=sc.nextInt();
    }
    void calcArea()
    {
        area=side*side;
    }
    void printArea()
    {
        System.out.println("The area of the square is: "+ area + " square units");
    }
}

public class NotSoGoodWay
{
	public static void main(String[] args)
	{
		Circle c1=new Circle();
		c1.getRadius();
		c1.calcArea();
		c1.printArea();

        Rectangle r1=new Rectangle();
        r1.getValues();
        r1.calcArea();
        r1.printArea();

        Square s1=new Square();
        s1.getValues();
        s1.calcArea();
        s1.printArea();
	}
}
