package cycle4;
import java.util.*;

public class Graphics {
    public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
                
		System.out.println("Enter The side of the Square : ");
		int s=sc.nextInt();
		Square sq=new Square(s);		
		System.out.println("Area of Square is " + sq.area());
                
                System.out.println("Enter The length of the Rectangle : ");
		int l=sc.nextInt();
                System.out.println("Enter The breadth of the Rectangle : ");
		int b=sc.nextInt();
		rectangle re=new rectangle(l,b);		
		System.out.println("Area of Rectangle is " + re.area());
                
		System.out.println("Enter The radius of the Circle : ");
		int r=sc.nextInt();
		circle ci=new circle(s);		
		System.out.println("Area of Circle is " + ci.area());		
		
		System.out.println("Enter The breadth of the Triangle : ");
		int s1=sc.nextInt();
		System.out.println("Enter The height of the Triangle : ");
		int s2=sc.nextInt();
		triangle t=new triangle(s1,s2);
		System.out.println("Area of Triangle is " + t.area());
	}
}
