class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            nums[i]=nums[i]*nums[i];
        }
        //Arrays.sort(nums);
        for(int i=0; i<n-1; i++){
            int j=i+1;
            while(j>0 && nums[j]<nums[j-1]){
                int t=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=t;
                j--;
            }
        }
        return nums;
        
    }
}