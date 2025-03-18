package revision;

public class ReverseOfEachCharacterWithSamePosition {

	public static void main(String[] args) {
		
		String s="hellow world";
		
		String[] st=s.split(" ");
		
		for(int i=0; i<=st.length-1; i++) {  
			
			for(int j=st[i].length()-1; j>=0; j--) {
				
				System.out.print(st[i].charAt(j));
			}
			
			System.out.print(" ");
			
		}
	}
}
