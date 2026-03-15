class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length==1) return strs[0];
        String finalAnswer="";
		
		String word=strs[0];
		
		for (int i=0;i<word.length();i++) {
			
			String comparer=word.substring(0, i+1);
			
			for (int j=1;j<strs.length;j++) {
				
				if (strs[j].startsWith(comparer) ==false) {
					break;
				} else if ((strs[j].startsWith(comparer) ==true) && (j==strs.length-1)) {
					
					finalAnswer=comparer;
				}
				
			}
			
		}
		
		return finalAnswer;
        
    }
}