package ThisStatement;

class Student102 {

	int rollno;
	float fee;

	Student102(int rollno) {

		this.rollno = rollno;

	}

	Student102(int rollno, float fee) {
		this(rollno);
		this.fee = fee;

	}

	void display() {
		System.out.println(rollno + "   " + fee);
	}

}

public class ThisStatement4 {

	public static void main(String[] args) {

		Student102 s1 = new Student102(111);

		Student102 s2 = new Student102(112, 6000f);

		s1.display(); // 111 0.0
		s2.display(); // 112 6000.0

	}

}
