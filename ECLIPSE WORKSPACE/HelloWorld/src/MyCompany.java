
public class MyCompany {

	public static void main(String[] args) {
		
		Worker machine = new Machine("Suzuki", "DR 350 S", 1);
		
		
		
		machine.startWork();
		
		try{
			
			Thread.sleep(10000);
		}
		
		catch(InterruptedException e){
			
			//TODO isto nao se deve fazer
			e.printStackTrace();
		}
		
		
		machine.stopWork();
		
		System.out.println("A maquina trabalhou " + machine.workedHours() + " segundos");
		
	}
}
