package MethodOverloding;

public class DisplayOverloding {

	public void disp(int a, char b) {

		System.out.println(a + "       " + b);
	}

	public void disp(char c, int a) {

		System.out.println(c + "     " + a);
	}
}
	class MethodOverloding1 {

		public void call() {

			System.out.println("calling");
		}
	

		public static void main(String[] args) {

			DisplayOverloding v = new DisplayOverloding();
			
			v.disp(8, 'T');
			
			v.disp('E', 9);
			

			MethodOverloding1 h = new MethodOverloding1();
			h.call();

		}
	}


