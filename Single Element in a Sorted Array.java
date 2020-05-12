/**
*You are given a sorted array consisting of only integers where every element appears exactly twice, 
*except for one element which appears exactly once. 
*Find this single element that appears only once.
**/



public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        
        for (int i=0,j=1;i<n-1;i+=2){
            if (nums[i]!=nums[j]){
                return nums[i];
            }
            j+=2;
        }
        return nums[n-1];
        
    }
}
