  package newPrograms;

public class ReverseProgr {

	public static void main(String[] args) {
		
		 
		String s="i love my india";
		String[] str=s.split(" ");
		String reverse="";
		String original="";
		for (int i=0; i<str.length; i++) {
			
			original=original+" "+str[i];
			reverse=str[i]+" "+reverse;
		}
		System.out.println("original: "+original);
		
		System.out.println("reverse: "+reverse);
		
		
		
	}

}
