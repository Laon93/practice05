package prob06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape rectangle = new Rectangle(5,6);
		Shape rectTriangle = new RectTriangle(6,2);
		
		List li = new ArrayList();
		
		li.add(rectTriangle);
		li.add(rectangle);
		
		for(int i=0; i<li.size(); i++)
		{
			
		}
		
		

	}
	
	public static void print(Shape s1) {
		
		System.out.println("area : " + s1.getArea());
		System.out.println("perimeter : " + s1 .getPerimeter());
		
		/*Scanner sc = new Scanner(System.in);
		s1.resize(sc.nextDouble());*/
		
		System.out.println("new area : " + s1.getArea());
	}

}
