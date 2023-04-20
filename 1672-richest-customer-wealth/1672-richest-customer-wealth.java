class Solution {
    public int maximumWealth(int[][] accounts) {
        int temp = 0;
        int res = 0;
        for(int[] i : accounts){
            for(int j : i){
                temp += j;
            }
            if(temp >= res){
                res = temp;
            }
            temp = 0;
        }
        return res;
    }
}