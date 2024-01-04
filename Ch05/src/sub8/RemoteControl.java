package sub8;

public interface RemoteControl {
	// 인터페이스는 오로지 추상 메서드만
	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp();
	public void chDown();

	public void soundUp();
	public void soundDown();
	
	
}
