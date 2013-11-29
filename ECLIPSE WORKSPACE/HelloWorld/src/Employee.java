import java.util.ArrayList;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Duration;


/**
 * class to represent one employee 
 * */
public class Employee implements Worker {

	private int 	empNum;
	private String 	name;
	private String 	city;
	private double 	salary;
	
	private ArrayList<TimeIntervalNested> intervals;
	
	private Date startedAt;
	
	public Employee(){
		
		this.city = "Lisboa";
		this.intervals = new ArrayList<>();
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
	 *   @param salary The salary of the {@link Employee}
	 * */
	
	public Employee (int empNum, String name, String city){
		
		//this.empNum = empNum;
		//this.name = name;
		this(empNum,name);
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
	
	public double getSalary(){
		
		return salary;
	}
	
	public void setEmpNum(int empNum){
		
		this.empNum = empNum;
	}
	
//	public void setName( String name){
//		
//		this.name = name;
//	}
	
	public void setName(String...names){
		
		for (int i=0 ; i < names.length; i++){
			
			this.name += names[i] + ((i==names.length-1)?"": " ");
		}
	}
	 
	public void setCity(String city){
		
		this.city = city;
	}
	
	public void setSalary(double salary){
		
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		
		//return "Empregado " + getName() + " " + getEmpNum() + " " + getCity();
		
		//Com o StringBuilder
		//Utilizaçao da "API Fluent" (Idioma Fluente)
		StringBuilder builder = new StringBuilder("Employee [");
		builder	.append("empName=").append(this.getName())
				.append(", empNum=").append(this.getEmpNum())
				.append(", empCity").append(this.getCity());
		
		return builder.toString();
	}
	
	public boolean startWork(){
		
		if (isWorking())
			return false;
		
		System.out.println("Empregado Inicia trabalho.");
		this.startedAt = new Date();
		return true;
	}
	
	@Override
	public void stopWork() throws UnsupportedOperationException{
		
		if (isWorking()){
			this.intervals.add(new TimeIntervalNested(startedAt, new Date()));
			
			this.startedAt = null;
			System.out.println("Empregado parou de trabalhar");
		}else{
			
			throw new UnsupportedOperationException("O empregado ainda começou a trabalhar");
		}
	}
	
	public long workedHours(){
		
		long workedHours = 0;
		for (TimeIntervalNested interval : this.intervals) {
			workedHours += interval.duration();
		}
		
		return workedHours + sessionTimeInSeconds();
	}
	
	@Override
	public boolean equals(Object obj){
		Employee emp = (Employee) obj;
		
		return 	(this.getName().equals(emp.getName())) && (this.getEmpNum() == (emp.getEmpNum())) && 
				(this.getCity().equals(emp.getCity())) && (this.getSalary() == (emp.getSalary()));
	}

	@Override
	public boolean isWorking() {
		
		return this.startedAt != null;
	}

	private long sessionTimeInSeconds(){
		
		if (!isWorking())
			return 0;
		
		Date now = new Date();
		DateTime startDate = new DateTime(this.startedAt);
		DateTime endDate = new DateTime(now);
		
		return new Duration(startDate, endDate).getStandardSeconds();
		
	}
	
	private class TimeIntervalNested {

		public Date startWorkDate,
					endWorkDate;
		
		public TimeIntervalNested(Date startWorkDate, Date endWorkDate){
			
			this.startWorkDate = startWorkDate;
			this.endWorkDate = endWorkDate;
		}
		
		public long duration(){
			
			DateTime dt1 = new DateTime(startWorkDate);
			DateTime dt2 = new DateTime(endWorkDate);
			
			return new Duration(dt1, dt2).getStandardSeconds();
		}
		
	}
}



