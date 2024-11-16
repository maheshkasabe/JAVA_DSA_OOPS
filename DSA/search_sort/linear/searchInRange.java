package com.search_sort.linear;

public class searchInRange {
    public static void main(String[] args){
        int[] arr = {3,6,5,8,9,-1,-23};
        int target = 8;
        System.out.println(serach(arr, target, 1,5));
    }   
    
    static int serach(int[] arr, int target, int start, int end){
        for(int i=start; i <= end; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    
}
