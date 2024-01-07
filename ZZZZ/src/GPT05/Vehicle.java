package GPT05;

public class Vehicle {
	private String vehicleNumber;
	
	public Vehicle (String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	public void showInfo() {
		System.out.println(vehicleNumber + "번 버스입니다.");
	}
	
	public String getvehicleNumber() {
		return vehicleNumber;
	}
}
