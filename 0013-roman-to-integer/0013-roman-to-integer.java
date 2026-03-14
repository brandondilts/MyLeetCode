import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
		
		int finalAnswer=0;
        int length= s.length();
        
        HashMap<Character, Integer> romanNum = new HashMap<>();
        romanNum.put('I',1);
        romanNum.put('V',5 );
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);
        
       
        
        for (int i=length-1; i>=0; i--) {
        	
        	//look at the thing prior
        	if ((i > 0) && (length>1)) {
        		char currChar=s.charAt(i);
        		char previousChar=s.charAt(i-1);
        		if (romanNum.get(currChar) <= romanNum.get(previousChar)) {
        			finalAnswer += romanNum.get(currChar);
        			
        		}else {
        			finalAnswer += (romanNum.get(currChar) - romanNum.get(previousChar)); 
        			i--;
        		}
        		
        		
        	//if first char, so don't want to go out of bounds	
        	//} else if ((length>1) && i==0) {
        	//	if s.
        	//	char currChar=s.charAt(i);
        	//	char previousChar=s.charAt(i-1);	
        		
        	//single char	
        	} else {
        		finalAnswer+= romanNum.get(s.charAt(0));
        	}
    
        	
        }
        
        
        
        
        
        return finalAnswer;
    }
}