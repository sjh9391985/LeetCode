class Solution {
    public int[] getConcatenation(int[] nums) {
        int lng = nums.length;
        int[] res = new int[lng*2];
            for(int j = 0; j < lng; j++){
                res[j] = nums[j];
                res[j+lng] = nums[j];
            }
        return res;
    }
}