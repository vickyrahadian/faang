package geeksforgeeks;

//https://www.geeksforgeeks.org/missing-characters-make-string-pangram/

public class CheckPangramMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kalimat = " The quick brown fox jumps over the lazy dog";
		System.out.println(checkPangramMissing(kalimat));
	}

	public static String checkPangramMissing(String s) {
		boolean[] marks = new boolean[26];
		String reValue = "";

		s = s.toUpperCase();

		for (char t : s.toCharArray()) {
			if ('A' <= t && t <= 'Z') {
				marks[t - 'A'] = true;
			} else {
				continue;
			}
		}

		for (int i = 0; i < 26; i++) { 
			if (marks[i] == false) {
				int x = 'A' + i;
				reValue += String.valueOf((char) x);
			}
		}

		return reValue;
	}

}
