
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TCP_Client client = new TCP_Client("10.25.141.13", 2000);

		client.t.join();
	}

}
