package ThisKeyword;

class Demo {

	int rollno;
	float fee;

	Demo(int rollno, float fee) {
		System.out.println("local rollno   :" + rollno);
		System.out.println("local fee   :" + fee);
		System.out.println("Global rollno   :" + this.rollno);
		System.out.println("Global fee   :" + this.fee);

		this.rollno = rollno;
		this.fee = fee;

		System.out.println(" after update ,global rollno   :" + this.rollno);
		System.out.println("after update,global fee   :" + this.fee);
	}

	void display() {
		System.out.println(rollno + "    " + fee);

	}
}

public class ThisKeyword3 {

	public static void main(String[] args) {

		Demo s1 = new Demo(111, 5000f);
		s1.display();

		Demo s2 = new Demo(156, 6000f);
		s2.display();
	}
}
