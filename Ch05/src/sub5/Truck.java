package sub5;

public class Truck extends Car {

	public int capacitiy;
	
	public Truck(String name, String color, int speed, int capacitiy) {
		super(name, color, speed);
		this.capacitiy = capacitiy;
	}
	
	public void load(int capacitiy) {
		this.capacitiy += capacitiy;
	}
	
	@Override
	public void speedDown(int speed) {
		this.speed -= speed - 10;
	}
	
	public void show() {
		super.show();
		System.out.println("적재량 : " + this.capacitiy);
	}
}
