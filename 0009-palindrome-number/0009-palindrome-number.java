class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int x_copy= x;
        int pal=0;
        while(x_copy!=0){
            pal=(pal*10)+(x_copy%10);
            x_copy=x_copy/10;
        }
        // System.out.println(pal);
        return pal==x; 
    }

}