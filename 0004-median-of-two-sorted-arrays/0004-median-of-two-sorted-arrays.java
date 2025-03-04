class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int m=a.length, n=b.length;
        int arr[]=new int[m+n];
        int p1=0, p2=0;
        for(int i=0; i<(m+n); i++){
            if(p1>=m){
                arr[i]=b[p2];
                p2++;
            }
            else if(p2>=n){
                arr[i]=a[p1];
                p1++;
            }
            else if(a[p1]<=b[p2]){
                arr[i]=a[p1];
                p1++;
            }
            else{
                arr[i]=b[p2];
                p2++;
            }
        }
        n=arr.length;
        double r;
        if(n%2==0){
            int x=n/2;
            r=(arr[x-1]+arr[x])/2f;
        }
        else{
            int x=n/2;
            r=arr[x];
        }
        return r;

        
    }
}