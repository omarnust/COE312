
public class Main {
	public static void main(String[] args) throws InterruptedException{
		Counter counter = new Counter();
		Door door1 = new Door(counter, 5);
		Door door2 = new Door(counter, 5);
		
		door1.t.join();
		door2.t.join();
		
		System.out.println("total: " + 
				Integer.toString(counter.getCounter()));
	}

}
