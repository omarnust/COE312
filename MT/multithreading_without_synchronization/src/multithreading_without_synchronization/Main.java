package multithreading_without_synchronization;


public class Main {

	public static void main(String[] args) {
		
		try {
		Bank bank = new Bank();
		System.out.println("AcountA: "+bank.getAccountA());
        System.out.println("AcountB: "+bank.getAccountB());
        
		Transfer tr  = new Transfer("transfer thread:",bank);
		AddSalary as = new AddSalary("Add salary thread:",bank);
        tr.start(); 
        as.start();
        
        tr.join();
        as.join();
        
        System.out.println("AcountA: "+bank.getAccountA());
        System.out.println("AcountB: "+bank.getAccountB());
        
		}catch(Exception e) {
			
		}
        
	}

}
