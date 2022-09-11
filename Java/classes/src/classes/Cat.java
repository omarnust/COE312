package classes;

public class Cat extends Mammal implements Pet{
	
	
	Cat(){
		System.out.println("Default");
	}
	
	
	Cat(int weight, int num_legs, String name){
		super(weight, num_legs);
		super.name = name;
	}
	
	public void sound() {
		System.out.println("Meow");
	}
	
	
	public void walk() {
		System.out.println("walking");
	}
}
