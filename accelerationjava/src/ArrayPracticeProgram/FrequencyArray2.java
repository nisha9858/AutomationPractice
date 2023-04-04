package ArrayPracticeProgram;

public class FrequencyArray2 {
	
	public static void main(String[] args) {
		
		
		int num[]= {1,2,3,4,2,2,3,1};
		
		int fre []=new int [num.length];
		
		int visited=-1;
		
		for(int i=0;i<num.length;i++) {
			
			  int count=1;
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]==num[j]) {
					
					count++;
					
					fre[j]=visited;
					
					
				}
			}
			
			if(fre[i]!=visited) {
				
				fre[i]=count;
			}
		}
		System.out.println("***************************************************************");
		
		for(int i=0;i<fre.length;i++) {
			
			if(fre[i]!=visited) {
				
				System.out.println(num[i]+"   :  "+fre[i]);
			}
				
			
			
		}
		
		
		
		
		
		
	}

}
