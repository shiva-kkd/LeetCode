class Solution {
    public int singleNonDuplicate(int[] nums) {
        int k=-1;
        for(int i=0; i<nums.length; i++){
            if(i==nums.length-1){
                k=nums[i];
                break;
            }
            else if(i==0){
                if(nums[i]!=nums[i+1]){
                    k=nums[i];
                    break;
                }
            }
            else if(i==(nums.length-1)){
                if(nums[i]!=nums[i-1]){
                    k=nums[i];
                    break;
                }
            }
            else{
                if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                    k=nums[i];
                    break;
                }
            }
        }
        return k;
        
    }
}