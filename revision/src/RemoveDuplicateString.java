
public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		
		String s="nikki";
		
		String result="";
		
		for(int i=0; i<s.length(); i++) {
			
			String ch=""+s.charAt(i);
			
			if(result.contains(ch)) {
				continue;
			}
			result=result+ch;
		}
		System.out.println(result);

	}

}
