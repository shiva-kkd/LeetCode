class Solution {
    public int singleNumber(int[] nums) {
        int r=0, n=nums.length;
        for(int i=0; i<n; i++) r^=nums[i];
        return r;
        
    }
}