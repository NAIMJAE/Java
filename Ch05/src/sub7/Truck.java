package sub7;

public class Truck extends Car{

	public int capacitiy;
	
	public Truck(String name, String color, int speed, int capacitiy) {
		super(name, color, speed);
		this.capacitiy = capacitiy;
	}

	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}

	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		super.show();
		System.out.println("적재량 : " + this.capacitiy);
	}
}
