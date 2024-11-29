class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length, s, i, j;
        int arr[]=new int[n];
        for(i=0; i<n; i++){
            s=0;
            for(j=0; j<accounts[i].length; j++){
                s+=accounts[i][j];
            }
            arr[i]=s;

        }
        s=arr[0];
        for(i=1; i<n; i++){
            if(arr[i]>s) s=arr[i];
        }
        return s;
        
    }
}