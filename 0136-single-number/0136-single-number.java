class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length, i, j, s, k=0;
        for(i=0; i<n; i++){
            s=0;
            for(j=0; j<n; j++){
                if(nums[j]==nums[i]) s++;

            }
            if(s==1){
                k=nums[i];
                break;
            }

        }
        return k;
        
    }
}