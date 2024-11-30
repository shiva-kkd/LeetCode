class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length, x=0;
        int arr[]=new int[2];
        for(int i=0; i<n; i++){
            x=nums[i];
            for(int j=0; j<n; j++){
                if(j==i) continue;
                else if(x+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;

    }
}