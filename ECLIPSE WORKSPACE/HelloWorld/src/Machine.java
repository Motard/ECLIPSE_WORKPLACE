import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Duration;


/**
 * Class for define machines
 * 
 * */

public class Machine implements Worker{
	
	//private fields
	private String manufacturer;
	private String model;
	private int sku;
	
	private long hoursWorked;
	private Date startedAt;
	
	
	public Machine(String manufacturer, String model, int sku){
		
		this.manufacturer = manufacturer;
		this.model = model;
		this.sku = sku;
	}
	
	
	/*
	 * Getters e Setters
	 * */
	
	public int getSku() {
		return sku;
	}
	
	public void setSku(int sku) {
		this.sku = sku;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getModel() {
		return model;
	}
	
	@Override
	public String toString(){
		
		return "Maquina " + getSku() + " " + getManufacturer() + " " + getModel();
		
	}
	
	public boolean startWork(){
		//Utilizaçao da logica invertida. Testar primeiro a falha
		if (isWorking())
			return false;
			
		System.out.println("Maquina iniciou...");
		this.startedAt = new Date();
		return true;
		
	}
	
	//Metodo idempotente - 
	@Override
	public void stopWork() throws UnsupportedOperationException{
		
		if (isWorking()){
			
			
			this.hoursWorked += sessionTimeInSeconds();
			
			this.startedAt = null;
			
			System.out.println("A maquina parou.");
		}else{
			
			throw new UnsupportedOperationException("A maquina ainda nao começou a trabalhar");
		}
	}
	
	@Override
	public long workedHours(){
		
		return this.hoursWorked + sessionTimeInSeconds();
	}

	private long sessionTimeInSeconds(){
		
		if (!isWorking())
			return 0;
		
		Date now = new Date();
		DateTime startDate = new DateTime(this.startedAt);
		DateTime endDate = new DateTime(now);
		
		return new Duration(startDate, endDate).getStandardSeconds();
		
	}
	
	@Override
	public boolean isWorking() {
		
		return startedAt != null;
	}
}
