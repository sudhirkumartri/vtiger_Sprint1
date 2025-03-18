package newPrograms;
public class CamelCase {
 public static void main(String[] args) {
	 
        String input = "welcome to tekpyramid";
       
        
        String[] str = input.split(" ");
 
        String output = "";
        for (String word : str) {
        	
        String result = "";
        
        for (int i = 0; i < word.length(); i++) {
        	
              if (i == 0) {
                    result = result + (word.charAt(i) + "").toUpperCase();
              }   
                 else {
                    result = result + (word.charAt(i) + "").toLowerCase();
                }
            }
            output = output + result+" ";
        }

        System.out.println(output);
        
    }
}

