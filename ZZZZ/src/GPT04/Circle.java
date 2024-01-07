package GPT04;

public class Circle extends Shape {
	public int radius;
	
	public Circle(int radius) {
			
		this.radius = radius;
	}
		
	// 직사각형의 면적 계산
	@Override
	public void calculateArea() {
		double calArea = (radius/2)*(radius/2) * 3.14;
		System.out.println("원의 면적 : " + calArea);
	}

}
