package BasicTutorial

class Strings {
	static void main(String[] args) {
		String sample = "Hello world";
		
		println(sample[0..4]); // Print the 5 character in the string
		
		println(sample[4]); // Print the 5 character in the string
		  
		//Print the 1st character in the string starting from the back
		println(sample[-1]);
		println(sample[1..2]);//Prints a string starting from Index 1 to 2
		println(sample[4..2]);//Prints a string starting from Index 4 back to 2
		
		String a = "Hello";
		
		  println("Hello"*3);
		  println(a*3);
		  
		  println(a.length());
		  
		 println(a.center(30))
		
	 }
}
