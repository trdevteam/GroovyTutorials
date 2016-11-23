package BasicTutorial

class Generics {
	static void main(String[] args) {
		
		def name = "tark";
		println("benim adim $name")
		
		// Creating a generic List collection
		ListType<String> lststr = new ListType<>();
		lststr.set("First String");
		println(lststr.get());

		ListType<Integer> lstint = new ListType<>();
		lstint.set(1);
		println(lstint.get());
	}
}


class ListType<T> {

	private T localt;

	public T get() {
		return this.localt;
	}

	public void set(T plocal) {
		this.localt = plocal;
	}
}