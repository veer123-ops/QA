package veer.com;

public class removethstring {

	public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Check if the character is already in the result string
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "hello";
        String result = removeDuplicates(inputString);
        System.out.println(result);
    }
}
