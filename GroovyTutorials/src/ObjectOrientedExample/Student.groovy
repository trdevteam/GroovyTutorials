package ObjectOrientedExample

class Student extends Person{
	private int StudentID;
	private String StudentName;
	 
	private void setStudentID(int pID) {
	   StudentID = pID;
	}
	 
	private void setStudentName(String pName) {
	   StudentName = pName;
	}
	 
	int getStudentID() {
	   return this.StudentID;
	}
	 
	String getStudentName() {
	   return this.StudentName;
	}
	 
	String getName() {
		return this.StudentName;
	 }
	
}
