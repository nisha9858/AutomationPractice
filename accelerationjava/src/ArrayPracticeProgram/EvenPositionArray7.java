package ArrayPracticeProgram;

public class EvenPositionArray7 {
	
	public static void main(String[] args) {
		
		int[] arr= {2,5,7,8,9,4,3};
		
		System.out.println("Elements of given array present on Even position");
		
		for(int i=1;i<arr.length;i=i+2) {
			
			System.out.println(arr[i]);
			
			
		}
		
	}

}
