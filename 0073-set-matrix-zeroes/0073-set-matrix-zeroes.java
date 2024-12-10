class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int arr[][]=new int[m][n];
        int r[]=new int[m];
        int c[]=new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    r[i]++;
                    c[j]++;
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(r[i]>0 || c[j]>0) matrix[i][j]=0;
            }
        }
        
    }
}