package StringClassExample;

public class StringClass1 {

	public static void main(String[] args) {

		StringClass1 c1 = new StringClass1(); // String class object creation

		System.out.println("c1 : " + c1);

		// Using Literals

		String s1 = "Mumbai"; // new object will be create in string constant pool

		String s2 = "Mumbai"; // no object will br create as its duplicate object ,so s2 points to s1 object

		String s3 = "Bangalore"; // new object will be create in string constant pool

		System.out.println("s1 :" + s1);

		System.out.println("s2 :" + s2);

		System.out.println("s3 :" + s3);

		System.out.println("s1 char count  :" + s1.length());

		System.out.println("s2 char count  :" + s2.length());

		System.out.println("s3 char count :" + s3.length());

		// inside string class compare two value: == ---> based on addresss
		// .equals ----> compare based on values

		System.out.println("s1 and s2 using '=='  :" + (s1 == s2));

		System.out.println("s1 and s2 using equals  :" + (s1.equals(s2)));

		System.out.println("s1 and s3 using '=='  :" + (s1 == s3));

		System.out.println("s1 and s3 using equals  :" + (s1.equals(s3)));

		String s4 = new String("Mumbai"); // two object 1.in constant pool 2.in non constant pool

		System.out.println(" s4 :" + s4);

		System.out.println("s1 and s4 using equals  :" + (s1.equals(s4)));

		System.out.println("s1 and s4 using '=='  :" + (s1 == s4));

		String s5 = new String("Mumbai"); // two object 1.in constant pool 2.in non constant pool 

		System.out.println(" s5 :" + s5); 

		System.out.println("s4 and s5 using equals  :" + (s4.equals(s5)));

		System.out.println("s4 and s5 using '=='  :" + (s4 == s5));

		String s6 = new String("Hyderabad"); // two object 1.in constant pool 2.in non constant pool

		System.out.println(" s6 :" + s6);

		System.out.println("s1 and s6 using equals  :" + (s1.equals(s6)));

		System.out.println("s1 and s6 using '=='  :" + (s1 == s6));

	}
}
