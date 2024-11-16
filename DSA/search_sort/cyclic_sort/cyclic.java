package com.search_sort.cyclic_sort;

import java.util.Arrays;

public class cyclic {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int correctInd = arr[i] - 1;
            if(arr[i] != arr[correctInd]){
                swap(arr,i,correctInd);
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
