package homework.h01;

// base
// https://leetcode.com/problems/palindrome-number/
class Solution {
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return n * 2;
        } 
    }
}
