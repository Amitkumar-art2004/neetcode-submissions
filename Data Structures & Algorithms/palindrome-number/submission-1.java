class Solution {
    public boolean isPalindrome(int x) {
       int reverse = 0 , rem;
        int org =x;
        while(x>0){
            rem = x%10;
            reverse = reverse*10 + rem;
            x = x/10;
        } 
        if(org==reverse){
            return true;
        }else{
            return false;
        }
    }
}