
public interface Worker {

	abstract void startWork();
	
	void stopWork();
	long workedHours();
	
}
