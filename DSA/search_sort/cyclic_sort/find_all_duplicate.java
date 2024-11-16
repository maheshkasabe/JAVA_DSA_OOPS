package com.search_sort.cyclic_sort;

import java.util.ArrayList;
import java.util.List;

public class find_all_duplicate {

    public List<Integer> findDuplicates(int[] nums) {
        int i =0;    
        while(i<nums.length){
            int cInd = nums[i] - 1;
            if(nums[i] != nums[cInd]){
                swap(nums,i,cInd);
            }else{
                i ++; 
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
              if(nums[index] != index + 1){
                  ans.add(nums[index]);
              }  
        }
        return ans;
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

