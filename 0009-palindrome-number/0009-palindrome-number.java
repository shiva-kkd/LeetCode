class Solution {
    public boolean isPalindrome(int x) {
        int n=x, res=0;
        while(x>0){
            int rem=x%10;
            res=res*10+rem;
            x/=10;
        }
        if(res==n) return true;
        else return false;
    }
}