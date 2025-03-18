
 
	public class MinMaxArray {
	    public static void main(String[] args) {
	        // Define an array of numbers
	        int[] a = {45, 2, 78, 34, 12, 89, 21, 56};

	        // Initialize min and max with the first element of the array
	        int min = a[0];
	        int max = a[0];

	        // Loop through the array to find the min and max
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] < min) {
	                min = a[i];
	            }
	            if (a[i] > max) {
	                max = a[i];
	            }
	        }

	        // Print the results
	        System.out.println("Minimum number: " + min);
	        System.out.println("Maximum number: " + max);
	    }
	}


