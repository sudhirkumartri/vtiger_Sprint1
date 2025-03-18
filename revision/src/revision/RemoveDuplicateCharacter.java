package revision;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
	
		
		String s="programming";
		
		String result="";
		
		for(int i=0;i<s.length();i++) {
			String ch=""+s.charAt(i);
			
			if(result.contains(ch)) {
				continue;
			}
			result=result+ch;
		}
		System.out.print(result);
		
	}

}
