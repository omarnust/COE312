package multithreading_without_synchronization;
// this class transfer money from acountA to acountB
public class Transfer extends Thread{
	Bank bank;
	private String threadName;
	
	Transfer(String name, Bank bank){
		threadName = name;
		this.bank = bank;
	}
	
	public void run() {
		try {
			System.out.println(threadName + " Reading account");
			int a = bank.accountA;
			int b = bank.accountB;
			
			Thread.sleep(1);
			
			System.out.println(threadName + " Transfering AED 2");
			a -= 2;
			b += 2;
			bank.accountA = a;
			bank.accountB = b;
			
		}catch(InterruptedException e) {
			
		}
	}
}
