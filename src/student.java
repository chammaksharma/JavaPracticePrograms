public enum student {
	John("11", 1), Bella("10"), Sam("13"), Viraaj("9");
	private String age; // age of students
	private int no; // age of students

	String getage() {
		return age;
	}

	student(String age) {
		this.age = age;
	}

	student(String age, int no) {
		this.age = age;
		this.no = no;
	}
}
