class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int digit=0;
        while(x>0){
            int rem=x%10;
            digit=digit*10+rem;
            x/=10;
        }
        return original == digit;
    }
}