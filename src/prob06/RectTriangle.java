package prob06;

//직각삼각형의 둘레를 구하기 위해 피타고라스의 정리를 사용할 때 Math 클래스 이용 가능
public class RectTriangle extends Shape implements Resizable {
	
	private double width;
	private double height;
	
	public RectTriangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	

	@Override
	public double getArea() {
		
		return (this.width * this.height / 2);
	}

	@Override
	public double getPerimeter() {
		return this.height + this.width + Math.sqrt((this.width*this.width) + (this.height*this.height));
	}
	
	@Override
	public void resize(double s) {
		this.width = this.width * s;
		this.height = this.height * s;
	}

	

}
