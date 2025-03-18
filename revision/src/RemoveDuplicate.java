
public class RemoveDuplicate {

	public static void main(String[] args) {
		
		
		int[] a= {12,34,56,67,12};
		
		String result="";
		
		for(int i=0; i<a.length; i++) {
			
			String ch=""+a[i];
			
			if(result.contains(ch)) {
				
				continue;
			}
			result=result+ch+" ";
		}

		System.out.println(result);
	}

}
