class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int reverse = 0;
        
        if (num < 0){
            return false;
        }

        while(num > 0){
            int digit = num % 10;
            reverse = (reverse * 10) + digit;
            num /= 10;
        }
        return (x == reverse);
    }
}