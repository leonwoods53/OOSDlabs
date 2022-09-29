package lab1;

//Student Name 	: 		Leon Woods
//Student Id Number: 	C00290263
//Date: 				29/9/2022
//Purpose: 				My first class implementation

public class ThermTest { // begin class ThermTest
	public static void main(String args[]) { // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer();		// Create another instance of our Thermometer class
		

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0); //instantiated to set 20.0 celsius as temperature of thermA
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermB.setCelsius(10.0); //instantiated to set 10.0 celsius as temperature of thermB
		System.out.println("Temp. of Thermometer B is " + thermB.getCelsius() ); //prints temperature of thermB (10.0)
		
	} // end main
} // end class ThermTests