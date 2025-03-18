package newPrograms;

public class OcuuranceOfChararacter0 {
	
	
	public static void main(String []args) {
		
		String s="mera bharat mahan";
		String outcome="";
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)==32) {
				
			outcome=outcome+"0";
			
			}
			else {
				outcome=outcome+s.charAt(i);
			}
		}
		System.out.print(outcome);
		
	}

}
