package revision;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int n,i, sum=0; 
		
		System.out.println("Enter the range");
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		
		if(n%2==0) {
			for( i=0;i<=n;i=i+2) {
				sum=sum+i;
			}
			System.out.println("sum of even number:"+sum);
			
		}
		else {
			for( i=1;i<=n;i=i+2) {
				sum=sum+i;
			}
			
			System.out.println("sum of odd number"+sum);
			
			
			
		}
			
			
		}
		
	}
		
		

		
		
		
		
	


