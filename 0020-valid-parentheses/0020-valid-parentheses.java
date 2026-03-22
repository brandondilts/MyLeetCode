class Solution {
    public boolean isValid(String s) {
		boolean answer=true;
		
		Stack<Character> myStack= new Stack<>();
		
		
		for (int i =0;i<s.length();i++) {
			if (s.charAt(i)=='('){
				myStack.push(s.charAt(i));	 
				
			} else if (s.charAt(i)=='[') {
				myStack.push(s.charAt(i));
				
			}else if (s.charAt(i)=='{') {
				myStack.push(s.charAt(i));
				
				
			} else if (s.charAt(i)==')') {
				if (myStack.empty()==true) {
					return false;
				}
				
				if (myStack.pop() !='(') {
					answer=false;
					break;
				}
				
			} else if (s.charAt(i)==']') {
				if (myStack.empty()==true) {
					return false;
				}
				if (myStack.pop() !='[') {
					answer=false;
					break;
				}
			} else if (s.charAt(i)=='}') {
				if (myStack.empty()==true) {
					return false;
				}
				if (myStack.pop() !='{') {
					answer=false;
					break;
				}
			}
			
		}
		
		if (myStack.empty()==false) {
			answer=false;
		}
		
		
		return answer;
    }
}