package implementing_runnable_interface;

public class Main{
	public static void main(String[] args) throws InterruptedException{
		ThreadDemo m1 = new ThreadDemo("Thread 1");
		ThreadDemo m2 = new ThreadDemo("Thread 2");
		
		
		
		
		m1.getThread().join();
		m2.getThread().join();
		System.out.println("Main has ended");
	}
	
}

