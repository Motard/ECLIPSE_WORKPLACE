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
	
	public void startWork(){
		
		System.out.println("Maquina iniciou...");
		//TODO cuidado, porque pode ja estar a trabalhar.
		this.startedAt = new Date();
		
	}
	
	@Override
	public void stopWork(){
		
		Date now = new Date();
		
		DateTime startDate = new DateTime(this.startedAt);
		DateTime endDate = new DateTime(now);
		
		Duration duration = new Duration(startDate, endDate);
		
		//TODO alterar para getStandartHours()
		this.hoursWorked = duration.getStandardSeconds();
		
		this.startedAt = null;
		
		System.out.println("A maquina parou.");
	}
	
	@Override
	public long workedHours(){
		//TODO acrescentar as horas de trabalho actual
		
		return this.hoursWorked;
	}
}
