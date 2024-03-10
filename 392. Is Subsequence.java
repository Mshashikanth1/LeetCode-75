class Solution {
    /**
    Time : O(max(n+m))
    space : O(1)
    approach : maintain the two pointers i, j for s& t respectively if both match then increment pointers
    else increment j pointer in t if the i pointer goes out of bounce the we found that the
    substring is present in the target string 
     */
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0,m=s.length(),n=t.length();
        while(i<m && j<n){
            if(s.charAt(i)==t.charAt(j)) i++;
            j++;
        }
        return i==m;
    }
}

/**
392. Is Subsequence
Solved
Easy
Topics
Companies
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 

Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?


 */
