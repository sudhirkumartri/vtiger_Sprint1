package practice1.DataDrivenTesting;

public class GenerateAlphanumericRandomData {

	public static void main(String[] args) {
		
		
		int n=20;
		
		String alphanumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb=new StringBuilder(n);
		
		for(int i=0; i<n; i++) {
			// generate randomnuber b/w 0 to alphanumeric varriable length
			int index=(int )(alphanumericString.length()*Math.random());
			
			// add character one by one in the end of sb
			sb.append(alphanumericString.charAt(index));
		}
		System.out.println(sb);

	}

}
