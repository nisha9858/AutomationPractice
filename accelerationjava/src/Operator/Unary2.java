package Operator;

public class Unary2 {
	
	public static void main(String[] args) {
		
		int a=55,b;
		
		b=a++;                                      //55
		int x=a, y;                                  //56
		
		System.out.println(x );                       //56
		
		y=++x;                                         //57
		
		System.out.println(a );                         //56
		System.out.println(b );                          //55
		System.out.println(x );                         // 57
		System.out.println(y );                         //57
		
		int p=-10,  q=20,  res;
		
		res=  p++    + -- q;
		
		System.out.println("res:   "+res );      //9
		
		System.out.println("p:  "+p );           //-9
		
		System.out.println("q:   "+q);            //19
	
		
		int res1=++p   +  ++q;
		
System.out.println("res1:   "+res1 );             //12
		
		System.out.println("p:  "+p );           //-8
		
		System.out.println("q:   "+q);            //20
	
		
	}

}
