package codingtest.ct.week01;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		
		rc = new Radio();
		rc.turnOFF();
	}
}
