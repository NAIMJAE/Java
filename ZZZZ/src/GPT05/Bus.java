package GPT05;

public class Bus extends Vehicle {
	public int arrivalTime;
	
	public Bus(String vehicleNumber, int arrivalTime) {
		super(vehicleNumber);
		this.arrivalTime = arrivalTime;
	}
	
	@Override
	public void showInfo() {
		System.out.println(getvehicleNumber() + "버스입니다.");
		System.out.println(arrivalTime + "분 후 도착예정입니다.");
	}
}
