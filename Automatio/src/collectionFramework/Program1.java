package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<Integer>();
		l1.add(34);
		l1.add(23);
		l1.add(34);
		l1.add(20);
		l1.add(30);
		l1.add(20);
		System.out.println(l1);
		HashSet hs1=new HashSet(l1);
		System.out.println(hs1);
	}

}
