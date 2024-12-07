class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length, m=nums[0], s=0;
        for(int i=1; i<n; i++){
            if(nums[i]>m) m=nums[i];
        }
        int hash[]=new int[m+1];
        for(int i=0; i<n; i++){
            hash[nums[i]]++;
        }

        for(int i=0; i<=m; i++){
            if(hash[i]==1){
                s+=i;
            }
        }
        return s;
    }
}