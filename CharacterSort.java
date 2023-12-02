package veer.com;

import java.util.Arrays;

public class CharacterSort {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		  public static void main(String[] args) {
		        String string = "rahgvhgcvfbvh";
		        char[] x = string.toCharArray();
		        
		        // Sort the character array using bubble sort
		        int n = x.length;
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - i - 1; j++) {
		                if (x[j] > x[j + 1]) {
		                    // Swap characters
		                    char temp = x[j];
		                    x[j] = x[j + 1];
		                    x[j + 1] = temp;
		                }
		            }
		        }
		        
		        // Print the sorted characters
		        System.out.print("Sorted characters: ");
		        for (char c : x) {
		            System.out.print(c);
		        }
		        System.out.println();
		    }
		}

	/*
	 
	  String input = "cbade";
        char[] charArray = input.toCharArray();
        
        // Sort the character array
        Arrays.sort(charArray);
        
        // Print the sorted characters
        System.out.println("Sorted characters: " + new String(charArray));
    }
}

	  */
