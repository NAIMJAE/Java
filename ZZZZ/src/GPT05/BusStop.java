package GPT05;

public class BusStop {
	public static String[] aaa = {"126번", "37번", "21번", "55번", "99번"};
	
	public static void main(String[] args) {
		Bus bus = new Bus(aaa[0], 10);
		
		bus.showInfo();
	}
	
}
