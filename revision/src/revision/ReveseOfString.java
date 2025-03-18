package revision;

public class ReveseOfString {
	
	public static void main(String[] args) {
		
		String s="i love my country";
		
		String[] st=s.split(" ");
		
		String rev="";
		
		for(int i=st.length-1; i>=0; i--) {
			
			rev=rev+" "+st[i];
		}
		System.out.println(rev);
		
	}

}
