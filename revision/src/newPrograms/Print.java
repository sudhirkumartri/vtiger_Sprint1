package newPrograms;

public class Print {
	public static void main(String[] args) {
		
		
		String s="hello world ";
		String [] str=s.split(" ");
		String reverse="";
		for(int i=str.length-1; i>=0; i--) {
			reverse=reverse+" "+str[i];
			
		}
		System.out.println(reverse);
		
		
	}
	

}
