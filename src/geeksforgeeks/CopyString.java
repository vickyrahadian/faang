package geeksforgeeks;

//https://www.geeksforgeeks.org/function-copy-string-iterative-recursive/

public class CopyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string_1 = "PT Bank Negara Indonesia";
		char[] char_string = string_1.toCharArray();
		char[] char_copy = new char[char_string.length];

		for (int i = 0; i < char_string.length; i++) {
			char_copy[i] = char_string[i];
		}
		
		System.out.println(char_copy);

	}

}
