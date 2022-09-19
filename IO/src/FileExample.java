import java.io.FileOutputStream;  
import java.io.IOException;

public class FileExample {
	public static void run() {
		try {  
			FileOutputStream fout=new FileOutputStream("testout.txt"); 
			
			fout.write('A');  // write takes int (byte) 65  
            
       	 	// not flushing because close will do it. 
      
       	 	fout.close(); 
       	 
            System.out.println("success...");
            
        } catch (IOException e) {  
            System.err.println("Error");  
        }  
	}
	
	public static void run2() {
		try {  
			FileOutputStream fout=new FileOutputStream("testout.txt"); 
			String s = "Welcome to COE312";
			byte[] b = s.getBytes();
			fout.write(b);    
            
       	 	// not flushing because close will do it. 
      
       	 	fout.close(); 
       	 
            System.out.println("success...");
            
        } catch (IOException e) {  
            System.err.println("Error");  
        }  
	}
	
}
