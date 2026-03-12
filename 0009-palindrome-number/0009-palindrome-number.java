class Solution {
    public boolean isPalindrome(int x) {
        int finalReverse=0;
        int number = x;

        if(x < 0){
            return false;
        }

        while (number !=0){
            finalReverse= (finalReverse * 10) + (number % 10);
            number= number /10;
        }

        return (finalReverse == x);
    }
}