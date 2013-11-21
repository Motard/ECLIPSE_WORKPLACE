
public interface Worker {

	abstract boolean startWork();
	
	//exemplo de orienta�ao � excepcao
	void stopWork() throws UnsupportedOperationException;
	
	long workedHours();
	boolean isWorking();
	
}
