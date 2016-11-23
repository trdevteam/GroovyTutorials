package BasicTutorial

class Numbers {

	static void main(String[] args) {
		Integer x = 5;
		  
		// Converting the number to double primitive type
		println(x.doubleValue());
		  
		// Converting the number to byte primitive type
		println(x.byteValue());
		  
		// Converting the number to float primitive type
		println(x.floatValue());
		  
		// Converting the number to long primitive type
		println(x.longValue());
		  
		// Converting the number to short primitive type
		println(x.shortValue());
		  
		// Converting the number to int primitive type
		println(x.intValue());
		
		//Comparison against a Integer of lower value
		println(x.compareTo(3));
		  
		//Comparison against a Integer of equal value
		println(x.compareTo(5));
		  
		//Comparison against a Integer of higher value
		println(x.compareTo(8));
		
	 }
	
	 
	
}
