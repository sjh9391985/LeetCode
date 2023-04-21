class Solution {
    public String restoreString(String s, int[] indices) {
        
        String[] resArr = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            resArr[indices[i]] = String.valueOf(s.charAt(i));
        }
        
        String res = "";
        for(String temp : resArr){
            res += temp;
        }
        
        return res;
        
    }
}