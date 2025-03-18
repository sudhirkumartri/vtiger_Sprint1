package newPrograms;
import java.util.Scanner;
public class Palindrome {
	
public static void main(String[] args) {
	int n, s=0, r,c;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number");//121
	
	n=sc.nextInt();
	
	c=n;
	
	while(n>0) {
		
		r=n%10;
		
		s=(s*10)+r;
		
		n=n/10;
	}
		if(c==s)
			
			System.out.println("palindrome number");
		
		else
			System.out.println("not palindrome number");
		
		
		
		
		
	
	
	
	
}
	
	

}
