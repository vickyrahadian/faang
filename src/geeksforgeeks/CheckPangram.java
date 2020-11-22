package geeksforgeeks;
//A pangram is a sentence containing every letter in the English Alphabet.
//https://www.geeksforgeeks.org/pangram-checking/

public class CheckPangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kalimat = " The quick brown fox jumps over the lazy dog";
		System.out.println(checkPangram(kalimat));   
	}

	public static boolean checkPangram(String s) {
		boolean[] marks = new boolean[26];
		
		if (s.length() < 26) {
			return false;
		}		
		s = s.toUpperCase();

		for (char t : s.toCharArray()) { 
			if('A' <= t && t <= 'Z') { 
				marks[t - 'A'] = true;
			} else {
				continue;
			}
		}
		
		for(boolean mark : marks) { 
			if(mark == false) {
				return false;
			}  
		} 
		
		return true;
	}

}
