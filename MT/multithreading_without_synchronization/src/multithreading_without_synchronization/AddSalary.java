package multithreading_without_synchronization;

// this function adds salary to accountA
public class AddSalary extends Thread{
	private String threadName;
	Bank bank;
	
	AddSalary(String name, Bank bank){
		threadName = name;
		this.bank = bank;
	}
	
	public void run() {
		try {
			
			System.out.println(threadName + " Reading salary");
			int a = bank.accountA;
			
			Thread.sleep(1);
			
			System.out.println(threadName + " Adding salary AED 3");
			a += 3;
			bank.accountA = a;

			
		}catch(InterruptedException e) {
			
		}
	}

}
