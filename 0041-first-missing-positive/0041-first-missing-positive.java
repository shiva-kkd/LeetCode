class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length, r=1;
        for(int i=0; i<n; i++){
            if(nums[i]<0) continue;
            if(nums[i]==r) r++;
        }
        return r;
        
    }
}