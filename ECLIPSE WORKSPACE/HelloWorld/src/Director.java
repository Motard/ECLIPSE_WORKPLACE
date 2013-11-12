
public class Director extends Employee{

	//public Director(){
		
		//super();//isto pode estar ou nao. Por defeito é construido 1 super()
	//}
	
	//public Director (int empNum, String name){
		
		//this();//chama o constructor por defeito
		
		//this.setEmpNum(empNum);
		//this.setName(name); //pode ser usado assim ou chamamos o construtor do pai. 
		
		//super(empNum, name);
		
	//}
	
	@Override
	public String toString(){
		
		return "Director " + getName() + " " + getEmpNum() + " " + getCity();
		
	}
	
	public void firesEveryone(){
		
		System.out.println("Despediu toda a gente!!!");
	}
}
