
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_Client implements Runnable {
	
	// ip address of the machine 
    String host;
    // need the port 
    int port;
    public Thread t;
    
	TCP_Client(String host, int port){
		// set the ip address and the port of the 
		// the server we will connect to.
		this.host = host;
		this.port = port;	
		// make this a thread
		t = new Thread(this);
		t.start();
	}
	public void run() {	
		try {
			// create a tcp connection.
			// if something goes wrong, the program will 
			// throw an exception
			Socket socket = new Socket(host, port);
			
			// returns a socket object 
			// grab the input stream so I can read the sensors
            InputStream input = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(input);
 
            // to read and print data 
            int character;
            while ((character = reader.read()) != -1) {
                 System.out.print((char) character);
            }
 
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}