class Solution {
    public boolean isPalindrome(int x) {
        int q=x, rem, result=0;

        if(x<0){
        return false;
       } 
        while(q!=0){
            rem = q%10;
            result = result*10+rem;
            q=q/10;
        }
        return (result == x);
       
    }
}