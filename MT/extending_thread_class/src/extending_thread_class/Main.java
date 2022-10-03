package extending_thread_class;

public class Main {
	public static void main(String[] args) {
		// create two threads to generate random numbers
		ThreadDemo t1 = new ThreadDemo("Thread 1");
		ThreadDemo t2 = new ThreadDemo("Thread 2");
        t1.start(); 
        t2.start();
	}
}

