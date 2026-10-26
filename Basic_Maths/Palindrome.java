class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself)
        // cannot be palindromes.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;

        // Reverse only half of the digits
        while (x > rev) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        // Even digits: x == rev
        // Odd digits: remove the middle digit using rev / 10
        return x == rev || x == rev / 10;
    }
}
