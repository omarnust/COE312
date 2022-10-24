
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TCP_Client client = new TCP_Client("192.168.68.101", 56693);

		client.t.join();
	}

}
