package collectionFramework;

import java.util.HashSet;

public class Program3 {

	public static void main(String[] args) {
		String s1="abcccddefghhijjkllmmnopqqrsttwxyzz";
		removeDuplicates(s1);
	}
	public static void removeDuplicates(String s) {
		HashSet<Character>hs1=new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hs1.add(s.charAt(i));
		
		}
		System.out.println(hs1);
	}
}
