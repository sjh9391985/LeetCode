class Solution {
    public int subtractProductAndSum(int n) {
        String s = Integer.toString(n);
        
        int product = 1;
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++){
            product *= (s.charAt(i) - '0');
            sum += (s.charAt(i) - '0');
        }
        return product - sum;
    }
}