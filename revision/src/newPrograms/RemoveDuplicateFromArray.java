package newPrograms;
import java.util.*;
public class RemoveDuplicateFromArray {

	
	public static void main(String[] args) {
		
		
		int[] a= {12,13, 2,11,12,13};
		
		
		removeDuplicates(a);

		
	}

	public static void removeDuplicates(int[] a) {
		
		
	HashSet	<Integer>hs1=new HashSet<Integer>();
		
	for(int i=0; i<a.length; i++) {
		
		hs1.add(a[i]);
	}
	System.out.print(hs1);
	
	}	
	
	
	
}
