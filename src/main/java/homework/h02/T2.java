package homework.h02;

// advanced
// https://leetcode.com/problems/divide-two-integers/
class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }
}
