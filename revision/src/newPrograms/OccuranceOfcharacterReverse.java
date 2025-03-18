package newPrograms;

public class OccuranceOfcharacterReverse {

	public static void main(String[] args) {
		
		String s="my name is don";
		String[] str=s.split(" ");
		String reverse="";
		String result="";
		for(int i=0; i<str.length; i++) {
			for(int j=str[i].length()-1; j>=0; j--) {
				
				
				reverse=reverse+str[i].charAt(j);
			}
			result=result+reverse+"  ";
			reverse="";
			
			
		}
		System.out.print(result);
		
	}

}
