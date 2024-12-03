class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n-1; i++){
            int j=i+1;
            while(j>0 && nums[j]<nums[j-1]){
                int t=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=t;
                j--;
            }
        }
        int k=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=k){
                break;
            }
            k++;
        }
        return k;
        
    }
}