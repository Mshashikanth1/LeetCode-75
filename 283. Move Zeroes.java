class Solution {
    public void moveZeroes(int[] nums) {

          int n=nums.length;
          for(int i=0;i<n;i++){
              if(nums[i]==0){
                  int k=i+1;
                  while(k<n && nums[k]==0) k++;
                  swap(nums,i,k);
              }
          }
        
    }
    public void swap(int[] nums,int i, int j){
        if(j<nums.length && i<nums.length) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        }
    }
}

/**
283. Move Zeroes
Solved
Easy
Topics
Companies
Hint
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 

Follow up: Could you minimize the total number of operations done?
 */
