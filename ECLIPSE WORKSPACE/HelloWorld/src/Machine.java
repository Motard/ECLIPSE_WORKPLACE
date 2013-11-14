
/**
 * Class for define machines
 * 
 * */

public class Machine implements Worker{
	
	//private fields
	private String manufacturer;
	private String model;
	private int sku;
	
	
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
	}
}
