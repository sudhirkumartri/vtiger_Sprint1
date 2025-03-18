package newPrograms;

public class FirstWordUppercaseInString {

	public static void main(String[] args) {
		
		String s="mera bharat mahan";
		
		String[] str=s.split(" ");
		
		for(int i=0; i<str.length; i++) {
			
			char c=str[i].charAt(0);
			
			if(c>=97&&c<=122) {
				char cap=(char) (c-32);
			String	test=cap+str[i].substring(1);
			
			System.out.print(test+" ");
			}
		}
		System.out.println((char)65);
		
		
	}

}
