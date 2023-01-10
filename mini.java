public class mini {

    private static String shortestSubstring(String input) {
		int distinctCharacters = countDistinctCharacters(input);
		int testLength = distinctCharacters;
		boolean found = false;
		String testSubstring = input;
		
		while (!found && testLength<input.length()) {
			for (int start = 0; start+testLength <= input.length(); start++) {
				testSubstring = input.substring(start, start+testLength);
				int distinctCharactersInSubstring = countDistinctCharacters(testSubstring);
				if (distinctCharactersInSubstring == distinctCharacters) {
					found = true;
					break;
				}
			}
			testLength++;
		}
		return testSubstring;
	}

	private static int countDistinctCharacters(String s) {
        int len = s.length();
		int distCount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			boolean isdist = false;
			
			for (int j = i; j < s.length(); j++) {
				if (j != i && s.charAt(j) == s.charAt(i)) {
					isdist = true;
				}
			}
			
			if (!isdist) {
				distCount++;
			}			
		}
		return len-distCount;
	}

    public static void main(String[] args) {
        System.out.println(countDistinctCharacters("xabbcacpqr"));
        System.out.println(shortestSubstring("xabbcacpqr"));
    }
}
