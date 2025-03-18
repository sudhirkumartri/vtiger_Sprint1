package newPrograms;

public class OcuuranceOfCharacter {

	public static void main(String[] args) {

		
		String s="my name is Sudhir kumar tripathi";
		
		String outcome="";
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)==32) {
				
				outcome=outcome+"0";
				
			}
			else {
				
				outcome=outcome+s.charAt(i);
			}
			
		}
		
		System.out.println(outcome);
		
		
		
	}

}
