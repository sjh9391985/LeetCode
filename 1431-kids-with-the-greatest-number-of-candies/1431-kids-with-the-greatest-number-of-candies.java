import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        List<Integer> candyList = new ArrayList<Integer>();
        for(int candy : candies) {
            candyList.add(candy);
        }
        Collections.sort(candyList, Collections.reverseOrder());
        Integer[] array = candyList.toArray(new Integer[candyList.size()]);
        
        int biggest = array[0];
        
        for(int candy : candies){
            if((candy+extraCandies) >= biggest){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        
        return result;
        
    }
}