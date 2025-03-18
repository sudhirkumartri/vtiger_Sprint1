package newPrograms;

import java.util.HashSet;

public class RemoveDuplicates {

	
		    public static void main(String[] args) {
		      
		      String s="abcccddrreesee";
		      
		      removeDuplicates(s);
		    }
		      public static void removeDuplicates(String s){
		          
		          HashSet<Character> hs1=new HashSet<Character>();
		          
		          for(int i=0; i<s.length(); i++){
		              hs1.add(s.charAt(i));
		          }
		      
		      System.out.print(hs1);
		    }
		

	}


