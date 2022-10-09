
public class Door implements Runnable{
	public Thread t;
	Counter counter;	
	
	Door(Counter c){
		counter = c;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		// uncomment one of the following functions
		run_nosynchronization();
		//run_withBlocksynchronization();
	}
	
	public void run_nosynchronization() {
		for (int i=0; i<5; i++) {
			counter.addCounter();
		}
	}
	
	public void run_withBlocksynchronization() {
		for (int i=0; i<5; i++) {
			synchronized(counter) {
			counter.addCounter();
			}
		}
	}
	
	
}
