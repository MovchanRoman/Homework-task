package homework.h04;

// advanced
// https://leetcode.com/problems/integer-to-roman/
class Solution {
    public int findComplement(int num) {
        int mask = 1;

        while (mask <= num) {
            mask <<= 1;
        }

        mask--;

        return num ^ mask;
    }
}
