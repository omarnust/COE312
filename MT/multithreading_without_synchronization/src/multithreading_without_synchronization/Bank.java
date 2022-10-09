package multithreading_without_synchronization;

public class Bank {
	private int accountA = 10;
	private int accountB = 10;
	
	public int getAccountA() {
		return accountA;
	}
	public int getAccountB() {
		return accountB;
	}
	public void setAccountA(int val) {
		accountA = val;
	}
	public void setAccountB(int val) {
		accountB = val;
	}
	
}
