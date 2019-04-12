
public class Q3 {
	public static void main(String[] args) {
		System.out.println(palindrome("Madamdfs Adam"));
	}
	public static boolean palindrome(String s1) {
		char[] word = s1.toCharArray();
		char[] newword = new char[word.length];
		char[] reversed = new char[word.length];
		
		int z = 0;
		
				
		for(int i = word.length-1; i >= 0 ;i--) {
			if(word[i] != ' ' && word[i]!= '’' && word[i] != ',' ) {
				reversed[z] = Character.toLowerCase(word[i]);
				z++;
			}
		
		}
		int h=0;
		for(int i = 0; i<word.length;i++) {
			if(word[i] != ' ' && word[i]!= '’' && word[i] != ',' ) {
				newword[h] = Character.toLowerCase(word[i]);
				h++;
			}
		
		}
		int matches = 0;
		for(int y = 0; y < reversed.length; y++) {
			if(reversed[y] == newword[y]) {
				matches++;
			}
		}
		if(matches == newword.length) {
			return true;
		}
		return false;
	}
}
//|| word[i]!=="'"