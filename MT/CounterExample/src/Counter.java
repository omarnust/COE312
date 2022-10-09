
public class Counter {
	private int count;
	Counter(){
		count = 0;
	}
	public int getCounter() {
		return count;
	}
	// public synchronized void addCounter() {
	public void addCounter() {	
		try {
			int val = count;
			Thread.sleep(0);
			count = val+1;
			System.out.println("Counter: " + 
				       Integer.toString(count));
		}catch(Exception e) {
			
		}
	}
}
