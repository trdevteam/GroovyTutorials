package BasicTutorial

class Closures {

	def static Display(clo) {
		// This time the $param parameter gets replaced by the string "Inner"
		clo.call("Inner");
	}

	static void main(String[] args) {
		def str1 = "Hello";
		def clos = { param -> println "${str1} ${param}" }
		clos.call("World");

		// We are now changing the value of the String str1 which is referenced in the closure
		str1 = "Welcome";
		clos.call("World");

		// Passing our closure to a method
		Closures.Display(clos);

		def lst = [6, 5, 3, 4];
		def value;

		value = lst.find {element -> element > 2}
		println(value);

		value = lst.findAll{element -> element > 2}
		value.each {print " " + it}
		println()
		// Are all value above 2
		value = lst.every{element -> element > 2}
		println(value);

		// Are all value above 4
		value = lst.every{element -> element > 4}
		println(value);
		def largelst = [4, 5, 6];

		// Are all value above 2
		value = largelst.every{element -> element > 2}
		println(value);
		
		value = lst.any{element -> element > 4}
		println(value);

	}
}
