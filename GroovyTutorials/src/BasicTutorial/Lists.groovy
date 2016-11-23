package BasicTutorial

class Lists {
	static void main(String[] args) {
		def lst = [11, 12, 13, 14];
		  
		println(lst);
		lst.add(15);
		  
		println(lst);
		lst.add(2,20);
		  
		println(lst);
		
		int[] lst2 = [2,5,8];
		println(lst2);
		
		lst.pop();
		println(lst)
		
		lst.remove(4);
		println(lst)
		
		def lstR= lst.reverse();
		println(lstR)
		
		lst.sort();
		println(lst)
		
	 }
}
