package codingtest.ct.week01;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	int MIN_VALUE = 0;
	int volume = 0;
	
	public void turnOn();
	public void turnOFF();
	public void setVolume(int volume);
	
}
