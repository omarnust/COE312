import java.util.Arrays;
/* 
 * https://www.w3schools.com/java/default.asp
 * 
 * Every line of code that runs in Java must be inside a class
   In our example, we named the class Main. 
   A class name should follow Pascal naming convention
   The name of the java file must match the class name. 
 
 * Variables:
   Primitives: for storing simple values like numbers, strings and booleans.
   Reference Types: for storing complex objects like email messages.
   
 * Casting
 * Operators
 * String class
 * Control flows
 * Arrays
  
*/

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("*** Hello COE 312 ***");
		
		// Java Variables
		System.out.println("*** Line 28: Java Variables ***");
		byte age = 30;
		long viewsCount = 3_123_456L;
		float price  = 11.32F;
		char letter = 'A';
		boolean isBoolean = true;
	
		System.out.println("*** Line 36: Casting ***");
		// explicit casting (widening cast)
		int myInt = 9;
	    double myDouble = myInt;
	    
	    // Implicit casting (narrowing cast)
	    double myDouble2 = 9.78d;
	    int myInt2 = (int) myDouble2;
	    
	    System.out.println("*** Line 45: Casting to/from string *** ");
	    // To convert a string to a number, we use one of the following methods:
	    Integer.parseInt("10");
	    Float.parseFloat("3.13");
	    Float.toString(3.14f);
	    
	    System.out.println("*** Line 51: Operators *** ");
	    // Operators
	    // Arithmetic operators +, -, *
	    // Comparison operators, ==, !=, >, >=, <=, <, 
	    // x == y;
	    // x != y;
	    // Logical operators &&, ||, !
	    
	    System.out.println("*** Line 59: String Class *** ");
	    // String is reference data type
	    String greeting = "Hello";
	    System.out.println("The length of the txt string is: " + greeting.length());
	    // More string methods
	    String txt = "Hello World";
	    System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
	    System.out.println(txt.toLowerCase());   // Outputs "hello world"
	    
	    System.out.println("*** Line 68: Java Match Class *** ");
	    // The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
	    System.out.println(Math.max(20,5));
	    
	    System.out.println("*** Line 72: Control Flow,if else *** ");
	    // If else statement
	    int time = 20;
	    if (time < 18) {
	      System.out.println("Good day.");
	    } else {
	      System.out.println("Good evening.");
	    }
	    
	    System.out.println("*** Line 81: ternary operator *** ");
	    // Ternary operator
	    int income = 100_00;
	    String ticket = (income > 100_000) ? "First" : "Economy";
	    
	    System.out.println("*** Line 86: switch statement *** ");
	    // switch
	    int day = 4;
	    switch (day) {
	      case 1:
	        System.out.println("Monday");
	        break;
	      case 2:
	        System.out.println("Tuesday");
	        break;
	      case 3:
	        System.out.println("Wednesday");
	        break;
	      case 4:
	        System.out.println("Thursday");
	        break;
	      case 5:
	        System.out.println("Friday");
	        break;
	      case 6:
	        System.out.println("Saturday");
	        break;
	      case 7:
	        System.out.println("Sunday");
	        break;
	    }
	    
	    System.out.println("*** Line 113: while/for loop *** ");
	    // while loop: The while loop loops through a block of 
	    // code as long as a specified condition is true:
	    int i = 0;
	    while (i < 5) {
	      System.out.println(i);
	      i++;
	    }
	    
	    // For loop: When you know exactly how many times you 
	    // want to loop through a block of code, use the for loop 
	    // instead of a while loop
	    for (int j = 0; j < 5; j++) {
	    	  System.out.println(j);
	    }
	    
	    System.out.println("*** Line 129: continue statement *** ");
	    // Java break and continue keywords
	    for (int k = 0; k < 10; k++) {
	    	  if (k == 4) {
	    	    continue;
	    	  }
	    	  System.out.println(k);
	    }
	    
	    System.out.println("*** Line 138: Arrays *** ");
	    // Arrays
	    String[] cars = {"BMW", "Honda", "Toyota"};
	    int[] numbers = {10, 20, 30};
	    int[] items = new int[5];
	    items[0] = 1;
	    items[1] = 2;
	    items[2] = 3;
	    // Array class provides some useful methods
	    System.out.println(Arrays.toString(items));
	    Arrays.sort(items);
	    System.out.println(Arrays.toString(items));
	    
	    // 2 d array
	    int[][] matrix = {{1,2,3},{4,5,6}};
	    System.out.println(Arrays.deepToString(matrix));
		
	    // for-each loop is a special loop for arrays
	    for (String c : cars) {
	      System.out.println(c);
	    }
	    
	    System.out.println("*** Line 160: final keyword for constants *** ");
		// constants: Constants (also called final variables) have a fixed value.  
		// Once we set them, we cannot change them. By convention, we use CAPITAL LETTERS 
		// to name constants.
		final float PI = 3.14F;	
	
		System.out.println("*** Line 166: Java Methods and methods overloading *** ");
		myMethod1();
		myMethod2("Ahmad", 10);
		System.out.println(myMethod3(6,7));
		
		System.out.println(plusMethod(6,7));
		System.out.println(plusMethod(6.5,7.9));
	}
	
	
	
	// Java Methods
	// static means that the method belongs to the class and not the object
	// void means that the method does not return value.
	static void myMethod1() {
		System.out.println("I am myMethod");
	}
	static void myMethod2(String name, int age) {
		System.out.println(name + " is " + age);
	}
	
	static int myMethod3(int x, int y) {
		return x + y;
	}
	
	// method overloading
	// With method overloading, multiple methods can have the same name with different parameters:
	static int plusMethod(int x, int y) {
		  return x + y;
	}

	static double plusMethod(double x, double y) {
		  return x + y;
	}
	
	// scope
	// Method scope
	// Block scope
	
}


