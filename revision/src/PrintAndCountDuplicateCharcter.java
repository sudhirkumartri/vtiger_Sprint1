
public class PrintAndCountDuplicateCharcter {

	public static void main(String[] args) {
	
		
		String s="programming";
		
		char[] ch=s.toCharArray();
		
		int count=0;
		for(int i=0; i<ch.length;i++) {
		
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
				
				System.out.println("the duplicate char are:"+ch[j]);
				count++;
			}
			
		}
		}
		System.out.println("the count of duplicate charcter:"+count);
	}

}
