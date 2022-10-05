package multithreading_without_synchronization;


public class Main {

	public static void main(String[] args) {
		
		try {
		Bank bank = new Bank();
		System.out.println("AcountA: "+bank.accountA);
        System.out.println("AcountB: "+bank.accountB);
        
		Transfer tr  = new Transfer("transfer thread:",bank);
		AddSalary as = new AddSalary("Add salary thread:",bank);
        tr.start(); 
        as.start();
        
        tr.join();
        as.join();
        
        System.out.println("AcountA: "+bank.accountA);
        System.out.println("AcountB: "+bank.accountB);
        
		}catch(Exception e) {
			
		}
        
	}

}
