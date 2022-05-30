class Solution {
    public boolean isValid(String s) {
        
       
		Stack<Character> stack = new Stack();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '(':
				stack.push('(');
				break;
			case '[':
				stack.push('[');
				break;
			case '{':
				stack.push('{');
				break;
			case ']':
				if (stack.empty()) // stack is empty, there is no open brackets
					return false;
				else if (stack.pop() != '[')
					return false;
				break;
			case ')':
				if (stack.empty()) // stack is empty, there is no open brackets
					return false;
				else if (stack.pop() != '(')
					return false;
				break;
			case '}':
				if (stack.empty()) // stack is empty, there is no open brackets
					return false;
				else if (stack.pop() != '{')
					return false;
				break;

			}

		}
		
	
if (stack.empty())
			return true;
		else
			return false;
     
        
    }
}
