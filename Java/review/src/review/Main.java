package review;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterPassing paramPassing = new ParameterPassing(10);
		paramPassing.run();
		
		paramPassing.method4(paramPassing);
		System.out.println(paramPassing.x);
		
		
		
	}

}
