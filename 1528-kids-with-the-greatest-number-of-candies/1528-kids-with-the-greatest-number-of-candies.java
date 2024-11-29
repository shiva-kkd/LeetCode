class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>();

        int n=candies.length, i, s;
        s=candies[0];
        for(i=1; i<n; i++){
            if(candies[i]>s) s=candies[i];
        }
        for(i=0; i<n; i++){
            if((candies[i]+extraCandies)>=s) arr.add(i, true);
            else arr.add(i, false);
        }
        return arr;
        
        
    }
}