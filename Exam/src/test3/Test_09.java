package test3;
/**
 * 날짜 : 2024/01/04
 * 이름 : 박임재
 * 내용 : Java 추상 클래스, 다형성 연습문제
 */

abstract class Shape {
	public abstract void draw();
}

class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("draw Triangle!");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
}

public class Test_09 {
	public static void main(String[] args) {
		
		Test_09 here = new Test_09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	// 모르겠다
	public void draw(Shape obj) {
		obj.draw();
	}
}
