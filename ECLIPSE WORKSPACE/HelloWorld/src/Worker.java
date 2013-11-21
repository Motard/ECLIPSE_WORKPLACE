
public interface Worker {

	abstract boolean startWork();
	
	//exemplo de orientaçao á excepcao
	void stopWork() throws UnsupportedOperationException;
	
	long workedHours();
	boolean isWorking();
	
}
