package classes;

public abstract class Mammal extends Animal{
	String name;
	
	Mammal(){
		
	}
	
	Mammal(int weight){
		super(weight); // calling parent class constructor
	}
	
	Mammal(int weight, int num_legs){
		super(weight, num_legs); // calling parent class constructor
	}
	
	public void sound() {
		System.out.println("This mammal makes sound");
	}

}
