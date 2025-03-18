package newPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
		findFactorial(i);
		
	}	
		}
	public static void findFactorial(int n) {
		
		int fact=1;
		
		for(int i=1; i<=n; i++) {
			fact=fact*i;
			
		}
		System.out.println(n+"! "  +fact);
	}
}
