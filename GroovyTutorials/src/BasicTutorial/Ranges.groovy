package BasicTutorial

class Ranges {
	static void main(String[] args) {
		// Example of an Integer using def
		def rint = 1..10;
		
		  
		println(rint.contains(2));
		println(rint.contains(11));
		
		println(rint.get(2));
		println(rint.get(4))

		println(rint.getFrom());
		
		println(rint.getTo());
		
		println(rint.isReverse());
		
		println(rint.subList(1,4));
		println(rint.subList(4,8));
		
	 }
}
