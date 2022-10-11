package server;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;

public class Server {  
	public static void startServer(){  
		try{  
			ServerSocket ss=new ServerSocket(6666);  
			System.out.println("Listening for connection on 6666");
			while(true) {
				Socket s=ss.accept();//establishes connection   
				System.out.println("Connection");
		
				DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
				dout.writeUTF("Welcome");    
			}
			
		}catch(Exception e){
			System.out.println(e);
			}  
		}  
}  