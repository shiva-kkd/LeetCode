class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length, i, j, s=0;
        int arr[]=new int[n];
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(nums[j]<nums[i]) ++s;
            }
            arr[i]=s;
            s=0;

        }
        return arr;
        
    }
}