package ObjectOrientedExample

class TestStudent {
	static void main(String[] args) {
		Student st = new Student();
		st.setStudentID(1);
		st.StudentID = 4;
		
		st.setStudentName("Joe");
		  
		println(st.getStudentID());
		println(st.studentID);
		println(st.getStudentName());
		println(st.getName());
	 }
}
