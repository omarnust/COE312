package classes;

public abstract class Animal {
	int weight;
	leg[] legs;
	
	Animal(){
		
	}
	Animal(int weight){
		this.weight = weight;
	}
	Animal(int weight, int num_legs){
		this.weight = weight;
		legs = new leg[num_legs];
		
		for(int i=0; i < num_legs; i++) {
			legs[i] = new leg();
		}
	}
		
}
