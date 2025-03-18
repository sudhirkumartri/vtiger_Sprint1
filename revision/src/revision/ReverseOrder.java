package revision;

public class ReverseOrder {
	
	    public static void main(String[] args) {
	        // Input string
	        String input = "I love my India";

	        // Split the string into words
	        String[] words = input.split(" ");

	        // Reverse the order of the words
	        StringBuilder reversedString = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedString.append(words[i]);
	            if (i != 0) {
	                reversedString.append(" ");
	            }
	        }

	        // Print the reversed string
	        System.out.println(reversedString.toString());
	    }
	}


