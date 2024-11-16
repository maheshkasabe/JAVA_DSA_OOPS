// https://leetcode.com/problems/find-the-duplicate-number/

package com.search_sort.cyclic_sort;

public class find_duplicate_num {
    
    public int findDuplicate(int[] nums) {
        int i =0;    
        while(i<nums.length){
            if(nums[i] != i + 1){
            int cInd = nums[i] - 1;
            if(nums[i] != nums[cInd]){
                swap(nums,i,cInd);
            }else{
                return nums[i];
            }
        }
            else{
                i ++; 
            }
            
        }
        
        return -1;
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
