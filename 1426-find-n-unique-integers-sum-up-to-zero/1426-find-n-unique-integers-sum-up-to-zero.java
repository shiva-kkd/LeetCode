class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        int x=n/2;
        if(n%2!=0){
            for(int i=0; i<n; i++){
                arr[i]=0-x+i;
            }
        }
        else{
            for(int i=0; i<n; i++){
                if(i<x){
                arr[i]=0-(n-1-i);
                }
                else{
                    arr[i]=0-arr[i-x];
                }
            }
        }
        return arr;
        
    }
}