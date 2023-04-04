package Operator;

public class Unary3 {   
	
	public static void main(String[] args) {
		
		int a=0,  b;
		
		b= a++  +  ++a  + ++a  +  a;
	
		System.out.println("a:  "+a );       //3           
		
		System.out.println("b:   "+b);         //8
		
	System.out.println("*******************************************   ");            
		
		a=-5;
		
		b= a--  +  --a  +  --a  +  a;
		
		System.out.println("a:  "+a );     //  -6  -7  -8  -8
		
		System.out.println("b:  "+b );     //-5  -7  -8  -8
		
		System.out.println("########################################" );
		
		a=21;
		
		b= --a + --a + --a + a +  ++a  + a++;
		
		System.out.println("a:  "+a );
		
		System.out.println("b:  "+b ); 
		
		a=-2 ;
		
		b= a--  + a + ++a + a++ + ++a + a++ + a;
	
		System.out.println("a:  "+a ); 
		
		System.out.println("b:  "+b); 
	
		
	}

}
