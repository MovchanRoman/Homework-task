package homework.h01;

// advanced
// https://leetcode.com/problems/rectangle-area/
class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
