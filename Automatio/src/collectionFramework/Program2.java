package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {
		int[]a= {12,34,45,67,56,12,34,45};
		removeDuplicates(a);
	}
	public static void removeDuplicates(int[]a) {
		
		
		Set<Integer>hs1=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			hs1.add(a[i]);
		}
		System.out.println(hs1);
	}

}
