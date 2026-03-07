class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i=0;
        int j;
        int[] finalAnswer= new int[2];

        while(i< nums.length){
            j=i+1;

            while((j) < nums.length) {
                if (nums[i]+nums[j]==target){
                    finalAnswer[0]= i;
                    finalAnswer[1]= j;
                    return finalAnswer;
                } else{
                    j++;
                }

                
            }

            i++;
        }     
        
        return finalAnswer;
    }

}