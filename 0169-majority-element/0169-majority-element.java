class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length, x=n/2, c=0, r=-1;
        for(int i=0; i<n; i++){
            c=0;
            for(int j=0; j<n; j++){
                if(nums[j]==nums[i]) c=c+1;
            }
            if(c>x){
                r=nums[i];
                break;
            }
        }
        return r;
        
    }
}