package com.search_sort.binary_search;

import com.search_sort.bubble.bubblesort;

public class binary{
    public static void main(String[] args){
    int[] arr= {2,3,7,9,12,14,16,23};
    int target = 15;
    int ans = search(arr, target);
    System.out.println(ans);
    }

    public static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid] ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1; 
    }
}