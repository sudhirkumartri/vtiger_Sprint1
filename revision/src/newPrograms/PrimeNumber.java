package newPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		boolean prime=true;
		int count=0;
		
		for(int i=2;i<=100;i++) {
			prime=true;
			
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					prime=false;
				}
				
			}
			if(prime) {
				
				System.out.println(i+" ");
				count++;
			}
			
		}
		System.out.println();
		System.out.println ("the count is :"+count);
		
	}

}
