class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        
        int temp = 0;
        
        for(int i = 0; i < nums.length; i++){
            temp += nums[i];
            res[i] = temp;
        }
        
        return res;
    }
}