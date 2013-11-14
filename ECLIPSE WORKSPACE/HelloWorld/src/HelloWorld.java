


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
			//emp.setCity("Cacém");
			
			//System.out.println("Hello " + emp.getName().toString() + ", size " + emp.getName().length());
			
			
			//Employee emp = new Employee(123, "Paulo Martins", "Cacém");
			
			//System.out.println("Hello " + emp.getName() + " from - " + emp.getCity());
			//System.out.println(emp.toString());
			
			Director dir = new Director();
			
			System.out.println(dir.getCity());
			
			Employee[] employeesList = new Employee[4];
			
			employeesList[0] = new Employee(231654,"Paulo Martins");
			employeesList[2] = new Director(2316,"Joao Silva");
			employeesList[3] = new Employee(231,"Pedro Correia");
			//System.out.println(employeesList[1]);
			//((Director)employeesList[0]).firesEveryone();
			int count = 0;
			for (int i=0; i<employeesList.length; i++){
				if (employeesList[i] != null){
					System.out.println(employeesList[i]);
					count++;
				}
			}
			
			System.out.println("Existem " + count + " empregados");
			System.out.println("******************");
			
			for (Employee emp: employeesList){
				
				System.out.println(emp);
				
			}
			
			System.out.println("**********************");
			
			//versao alternativa
			
			int ct = 0;
			
			for (Employee employee : employeesList) {
				
				if (employee == null)
					continue;
				
				System.out.println(employee);
				ct++;
			}
			
			System.out.println("**********************");
			
			Machine[] machineList = new Machine[4];
			machineList[0] = new Machine("Epson", "EMP-75",1000);
			machineList[1] = new Machine("Honda", "XRV", 2000);
			
			int ct1 = 0;
			for (Machine machine : machineList) {
				
				if (machine == null)
					continue;
				
				System.out.println(machine);
				ct1++;
			}
			System.out.println("Exitem " + ct1 + " maquinas.");
			System.out.println("**********************");
			
			
			
			Object[] objsList = new Object[8];
			objsList[0] = new Employee(231654,"Paulo Martins");
			objsList[2] = new Director(2316,"Joao Silva");
			objsList[3] = new Employee(231,"Pedro Correia");
			objsList[5] = new Machine("Epson", "EMP-75",1000);
			objsList[7] = new Machine("Honda", "XRV", 2000);
			
			int 	countEmps = 0,
					countMachs = 0,
					countDirs = 0,
					countWorkers = 0;
			
			for (Object obj : objsList) {
				
				if (obj == null)
					continue;
				
				System.out.println(obj);
				
				
				if (obj instanceof Employee)
					{
						countEmps++;
						((Employee)obj).startWork();
					}
				if (obj instanceof Director)
					{
						countDirs++;
						((Director)obj).startWork();
					}
				if (obj instanceof Machine) countMachs++;
				
				if (obj instanceof Worker) countWorkers++;
				
			}
			
			System.out.println("Existem: " + countEmps + " empregados dos quais " + countDirs + " director(es) e " +  countMachs + " maquinas e " + countWorkers + " unidades");
			
			Worker[] workersList = new Worker[8];
			
			workersList[0] = new Employee(231654,"Paulo Martins");
			workersList[2] = new Director(2316,"Joao Silva");
			workersList[3] = new Employee(231,"Pedro Correia");
			workersList[5] = new Machine("Epson", "EMP-75",1000);
			workersList[7] = new Machine("Honda", "XRV", 2000);
			
			countWorkers = 0;
			
			for (Worker w : workersList) {
				
				if (w == null)
					continue;
					
				System.out.println(w);
				w.startWork();
				countWorkers++;
			}
			System.out.println("Existem " + countWorkers + "unidades.");
		}
	}

	
	

