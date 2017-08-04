package prob06;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<Shape>();
		
		list.add( new Rectangle(5, 6) );
		list.add( new RectTriangle( 6, 2) );
		
		for( Shape shape : list ) {
			System.out.println( "area:" + shape.getArea() );
			System.out.println( "perimeter:" + shape.getPerimeter() );
			
			if( shape instanceof Resizable ) {
				Resizable resizable = (Resizable) shape;
				resizable.resize( 0.5 );

				System.out.println( "new area:" + shape.getArea() );
				System.out.println( "new perimeter:" + shape.getPerimeter() );

			}
		}

	}
	
/*	public static void print(Shape s1) {
		
		System.out.println("area : " + s1.getArea());
		System.out.println("perimeter : " + s1 .getPerimeter());
		
		
		
		System.out.println("new area : " + s1.getArea());
	}*/

}
