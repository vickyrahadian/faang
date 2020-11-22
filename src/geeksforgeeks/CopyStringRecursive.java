package geeksforgeeks;

public class CopyStringRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] string_1 = "Divisi Solusi Teknologi Informasi".toCharArray();
		char[] string_2 = new char[string_1.length];
		
		copyString(string_1, string_2, 0);
		System.out.println(string_2);
	}

	public static void copyString(char[] c1, char[] c2, int index) {
		if(index < c1.length) {
			c2[index] = c1[index];
		} else {
			return;
		}
		
		copyString(c1, c2, index + 1);
	}
}
