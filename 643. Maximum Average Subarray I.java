class Solution {

    /**
    aproach : fixed sliding window of size k, we can get the subarrays sum of size k by  currSum -first + last
    Time : O(n)
    Space : O(1)
    
     */
    public double findMaxAverage(int[] nums, int k) {
        int currSum=0,n=nums.length, i=0,j=0,maxSum=Integer.MIN_VALUE;
        while(i<k) currSum+=nums[i++];
        while(i<n) {
            maxSum=Math.max(maxSum,currSum);
            currSum= currSum-nums[j++] + nums[i++]; 
        } 
        maxSum=Math.max(maxSum,currSum);       
        return (double) maxSum/ (double)k;
    }
}

/**
643. Maximum Average Subarray I
Solved
Easy
Topics
Companies
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
 

Constraints:

n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104

 */
