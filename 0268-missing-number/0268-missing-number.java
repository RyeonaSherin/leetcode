class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length;
        int sumOfn=(n*(n+1))/2;
        int sumOfNums=0;
 
      for(int i=0;i<nums.length;i++){
        sumOfNums+=nums[i];
      }
      return sumOfn-sumOfNums;
    }
}