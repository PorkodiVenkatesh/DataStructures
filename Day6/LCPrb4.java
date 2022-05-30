class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuffer sb = new StringBuffer();
		
		ArrayList<Character> splChars = new ArrayList();
		ArrayList<Integer> indexPos = new ArrayList();
		
		for(int i =0; i< s.length(); i++) {
			char ch = s.charAt(i);			
			if(Character.isLetter(ch)) {
				sb.append(ch);
			}
			else {
				splChars.add(ch);
				indexPos.add(i);
			}
		}  
        
        sb.reverse();
        
     for(int i = 0; i< splChars.size(); i++) {
			int index = indexPos.get(i);
			char c = splChars.get(i);
			sb.insert(index, c);
		}

        return sb.toString();
    }
}
