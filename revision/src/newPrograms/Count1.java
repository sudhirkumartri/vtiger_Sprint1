package newPrograms;

public class Count1 {

	public static void main(String[] args) {

		int sum=0;
		for(int i=100; i<=500; i++) {
			if(i%100==11||i%100==22) {
				
				continue;
			}
			sum=sum+i;
			
		}
		System.out.println("the sum is : " +sum);
		
		
	}

}
