package extending_thread_class;
import java.util.Random;

//Thread Example by extending Thread class
public class ThreadDemo extends Thread{	
	
	private String threadName;
	Random r = new Random();
	
	ThreadDemo(String name){
		threadName = name;
		System.out.println("Creating " +  threadName );
	}
	
	public void run() {
		System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println(threadName + ": " + r.nextInt(0,100));
	            // Let the thread sleep for a while.
	            Thread.sleep(150);
	         }
	      }catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	}
}
