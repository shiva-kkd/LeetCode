class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        int n=nums.length, t=1;
        int hash[]=new int[n+1];
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(nums[i]==nums[i+1]){
                t=i;
                arr[0]=nums[i+1];
                break;
            }
        }
        for(int i=0; i<n; i++){
            hash[nums[i]]++;
        }
        for(int i=0; i<=n; i++){
            
            if(i!=0 && hash[i]==0){
                arr[1]=i;

                break;
            }
        }
        return arr;
        
    }
}