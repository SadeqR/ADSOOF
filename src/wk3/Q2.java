
public class Q2 {
	public static void main(String[] args) {
		System.out.println( checkStrings("blis2","blisanbltidiselisstablis2hment"));
		
		
	}
	public static Boolean checkStrings(String s1, String s2) {
		char[] word1 = s1.toCharArray();
		char[] word2 = s2.toCharArray();
		int matches = 0;
		boolean condition = true;
		
		for (int i=0;i<word2.length;i++) {
			if (word2[i]==word1[0]) {
				for(int z = 0;z<word1.length&&condition;z++) {
					if(word2[i]==word1[z]) {
						matches++;
						i++;
						
					}
					else {
						condition = false;
						matches = 0;
					}
				}
				condition = true;
				
				
			}
			
			
			
			
		}
		
		if(matches == word1.length) {
			return true;
		}
		return false;
		
	}
}

