package sub4;

public class Truck extends Car {

	public int capacitiy;
	
	public Truck(String name, String color, int speed, int capacitiy) {
		super(name, color, speed);
		this.capacitiy = capacitiy;
	}
	
	public void load(int capacitiy) {
		this.capacitiy += capacitiy;
	}
	public void show() {
		super.show();
		System.out.println("적재량 : " + this.capacitiy);
	}
}
