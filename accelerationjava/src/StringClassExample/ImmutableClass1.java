package StringClassExample;
	
	final class TestImmutableClass {
		
		final String name;
		
		final int salary;
		
		TestImmutableClass (String s1,int num1){
			
			name=s1;
			
			salary=num1;
			
		}
		
		public String getName() {
			
			return name;
		}
		
		public int getSalary() {
			
			return salary;
		}
	}
		
	public class ImmutableClass1 {
			
			public static void main(String[] args) {
				
				TestImmutableClass t1=new TestImmutableClass ("Nitin",25000);
				
				System.out.println(t1.getName());
				
				System.out.println(t1.getSalary());
				
			//	t1.name=Nisha;
				
			//	t1.salary=7890;
				
				TestImmutableClass t2=new TestImmutableClass ("Harshada",100000);
				
				System.out.println(t2.getName());
				
				System.out.println(t2.getSalary());
				
				
			}
		}
		
		
	


