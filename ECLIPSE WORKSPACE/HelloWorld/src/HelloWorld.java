


	/**
	 * This is an Hello World!!!
	 * Isto mostra a anatomia basica de um programa em JAVA.
	 * */
	public class HelloWorld {

		public static void main(String[] args){
			
			/*System.out.println("Foram passados " + args.length + " argumentos.");
			
			String str= "Hello World ";
			
			str = (args.length>0)?str + " " + args[0]:str;
			
			System.out.println(str);*/
			
			//Employee emp = new Employee();
			//emp.setEmpNum(1234);
			//emp.setName("Paulo");
			//emp.setCity("Cac�m");
			
			//System.out.println("Hello " + emp.getName().toString() + ", size " + emp.getName().length());
			
			
			Employee emp = new Employee(123, "Paulo Martins", "Cac�m");
			
			//System.out.println("Hello " + emp.getName() + " from - " + emp.getCity());
			
			System.out.println(emp.toString());
			
		}
	}

	
	
