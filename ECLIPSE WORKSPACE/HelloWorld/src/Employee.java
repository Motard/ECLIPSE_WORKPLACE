
/**
 * class to represent one employee 
 * */
public class Employee {

	private int 	empNum;
	private String 	name;
	private String 	city;
	
	public Employee(){
		
		this.city = "Lisboa";
	}

	public Employee (int empNum, String name){
		
		this();//chama o constructor por defeito
		
		this.empNum = empNum;
		this.name = name;
		
	}
	
	/**
	 * Creates an instance {@link Employee}, with arguments.
	 * 
	 *   @param empNum 	The number of the {@link Employee}
	 *   @param name 	The name of the {@link Employee}
	 *   @param city	The city of the {@link Employee}
	 * */
	
	public Employee (int empNum, String name, String city){
		
		this.empNum = empNum;
		this.name = name;
		this.city = city;
	}
	/*
	 * Getters and Setters
	 * */
	
	public int getEmpNum(){
		
		return empNum;
	}
	
	public String getName(){
		
		return name;
	}
	
	public String getCity(){
		
		return city;
	}
	
	public void setEmpNum(int empNum){
		
		this.empNum = empNum;
	}
	
	public void setName( String name){
		
		this.name = name;
	}
	
	public void setCity(String city){
		
		this.city = city;
	}
	
	@Override
	public String toString(){
		
		return getName() + " " + getEmpNum() + " " + getCity();
		
	}
}

