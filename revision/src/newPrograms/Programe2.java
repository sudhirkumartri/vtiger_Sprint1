package newPrograms;

public class Programe2 {//charracter reverse

	public static void main(String[] args) {
		
		String s="i love my india";
		String[] str=s.split(" ");
		String reverse="";
		
		for(int i=0;i<str.length;i++) {
			
		
		for(int j=str[i].length()-1; j>=0; j--) {
			reverse=reverse+" "+str[i].charAt(j);
			
		}
		}System.out.println(reverse);
		
	}
}
