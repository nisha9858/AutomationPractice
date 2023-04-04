package Operator;

public class Unary1 {
	
	public static void main(String[] args) {
		
		int a=10, b=a;
		
		System.out.println("a: "+a );
		System.out.println("b: "+b );
		
		int k=++a;       //11
		
		System.out.println("k: "+k);
		System.out.println("a: "+a );
		
		int j=k++;         //11  
		
		System.out.println("k: "+k );
		System.out.println("j: "+j);
		
		int r=21;
		
		System.out.println("r: "+ r++ );       //21
		System.out.println("r: "+ r );         //22
		System.out.println("r: "+ ++r );       //23
		System.out.println("r: "+r );          //23
		
		
		int x=105;
		
		System.out.println("x: "+  ++x );    //106
		System.out.println("x: "+  x--);      //106
		System.out.println("x: "+  x++ );    //105
		System.out.println("x: "+  --x );   //105
		
		
		
		
	}

}
