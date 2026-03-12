class Solution {
    public boolean isPalindrome(int x) {
        ArrayList<Integer> digitArray = new ArrayList<>();
        boolean finalAnswer=true;
        

        if (x<0){
            finalAnswer=false;

            return finalAnswer;
        }

        while (x > 0){
            digitArray.add(0, x % 10);
            x = x / 10;
        }
        int arraySize=digitArray.size();

        if (arraySize>0){
            for (int i=0;i<digitArray.size();i++){
                if (digitArray.get(i) != digitArray.get(arraySize -i-1)){
                    finalAnswer=false;
                }
            }
        }
        return finalAnswer;
    }
}