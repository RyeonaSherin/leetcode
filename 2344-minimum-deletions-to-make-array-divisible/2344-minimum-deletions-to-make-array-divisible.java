import java.util.Arrays;

class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int minOperations(int[] nums, int[] numsDivide) {
    
        int targetGcd = numsDivide[0];
        for (int i = 1; i < numsDivide.length; i++) {
            targetGcd = gcd(targetGcd, numsDivide[i]);
            if (targetGcd == 1) break; 
        }

       
        Arrays.sort(nums);

        
        for (int i = 0; i < nums.length; i++) {
            if (targetGcd % nums[i] == 0) {
                return i; 
            }
        }

        return -1;
    }
}