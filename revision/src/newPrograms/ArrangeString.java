package newPrograms;


public class ArrangeString {

	public static void main(String[] args) {
		
		String s="i love my india";
		String[] str=s.split(" ");
		String even="";
		String odd="";
		
		for(int i=0; i<str.length; i++) {
			
			if(i%2==0) {
				even=str[i]+" "+even;
				
			}
			else {
				
				odd=str[i]+" "+odd;
			}
				
		}
		System.out.print(odd+even);
	}

}
