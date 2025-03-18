
public class AvrgOfSum {

	public static void main(String[] args) {
		
		
	int	sum=0;
		
		int[] a= {3,3,7,9};
		
		
		for(int i=0; i<a.length; i++) {
			
			if(i%2!=0) {
				
			
			
			sum=sum+a[i];
			
			}
			
		}
		
		float avg=(float)sum/a.length;
		System.out.println("the odd index:"+avg);
	}

}





