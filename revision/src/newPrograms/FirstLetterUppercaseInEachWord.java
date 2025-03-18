package newPrograms;


		
		public class FirstLetterUppercaseInEachWord {

		    public static void main(String[] args) {
		        
		        String s = "mera bharat mahan";
		        
		        String[] words = s.split(" ");
		        
		        StringBuilder result = new StringBuilder();
		        
		        for (String word : words) {
		            
		            // Convert the first character to uppercase and concatenate with the rest of the word
		            char firstChar = word.charAt(0);
		            
		            if (firstChar >= 'a' && firstChar <= 'z') {
		                firstChar = (char) (firstChar - 'a' + 'A');  // Convert to uppercase
		            }
		            
		            // Append the capitalized word to the result
		            result.append(firstChar).append(word.substring(1)).append(" ");
		        }
		        
		        // Remove the trailing space and print the final result
		        System.out.println(result.toString().trim());
		    }
		

	}


