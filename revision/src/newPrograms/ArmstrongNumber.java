package newPrograms;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {

		int n, arm=0, rem,c;
		
		System.out.println("enter the number");
		
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		c=n;
		while(n>0) {
		rem=n%10;
		arm=(rem*rem*rem)+arm;
		n=n/10;
		}
		if(c==arm)
			
		System.out.println("this is armstrong number");
		else
			System.out.println("this is not armstrong number");
		
	}

}
