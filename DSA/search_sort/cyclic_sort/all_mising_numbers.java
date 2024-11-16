// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package com.search_sort.cyclic_sort;

import java.util.ArrayList;
import java.util.List;

public class all_mising_numbers {

    static List<Integer> findDisappearedNumbers(int[] nums){
        int i = 0;
         while(i<nums.length){
            int correctInd = nums[i] - 1;
            if(nums[i] != nums[correctInd]){
                swap(nums,i,correctInd);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
              if(nums[index] != index + 1){
                  ans.add(index+1);
              }  
        }
        return ans;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
