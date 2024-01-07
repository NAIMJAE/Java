package GPT04;

public class Rectangle extends Shape {
	public int width;
	public int height;
	
	public Rectangle(int width, int height) {
		
		this.width = width;
		this.height = height;
	}
	
	// 직사각형의 면적 계산
	@Override
	public void calculateArea() {
		int recArea = (width * height) / 2;
		System.out.println("직사각형의 면적 : " + recArea);
	}
}
