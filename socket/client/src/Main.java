import java.io.*;  
import java.net.Socket;  

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{      
			Socket s=new Socket("localhost", 6666);
			
			DataInputStream din=new DataInputStream(s.getInputStream());  
			System.out.println(din.readUTF());  
			  
			s.close();  
		}catch(Exception e){
			System.out.println(e);
		}  
	}

}
