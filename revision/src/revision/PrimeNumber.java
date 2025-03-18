package revision;

import java.util.Scanner;

public class PrimeNumber {//2,3,5,7,11,13,17,19,23

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int i,count,j,total=0;
		
		for( i=1;i<=n;i++) {
			count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				if(count==2) {
					total=total+i;
					
				}
				
			}
			System.out.println("total prime member:"+total);
		}
		
	}

}
