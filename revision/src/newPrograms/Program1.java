package newPrograms;

public class Program1 {

	public static void main(String[] args) {

			
			String s="i love my india";
			String[] str=s.split(" ");
			String even="";
			String odd="";
			
			for(int i=str.length-1; i>=0; i--) {
				
				if(i%2==0) {
					even=even+" "+str[i];
					
				}
				else {
					odd=odd+" "+str[i];
				}
					
			}
			System.out.print(odd+even);
		}

	
	}


