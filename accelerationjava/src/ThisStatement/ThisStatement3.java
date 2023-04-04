package ThisStatement;

class Student101 {

	int rollno;
	float fee;

	Student101(int rollno) {

		this.rollno = rollno;
	}

	Student101(int rollno, float fee) {

		this(rollno);
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + "  " + fee);
	}
}

public class ThisStatement3 {
	public static void main(String[] args) {

		Student101 s1 = new Student101(111);
		
		System.out.println(s1.rollno + "   " + s1.fee); // 111 0.0

		Student101 s2 = new Student101(112, 6000f);
		
		System.out.println(s2.rollno + "   " + s2.fee); // 112 6000.0

		s1.display(); // 111 0.0
		s2.display(); // 112 6000.0

	}

}
