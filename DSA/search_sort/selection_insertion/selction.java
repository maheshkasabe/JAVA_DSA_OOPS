package com.search_sort.selection_insertion;

import java.util.Arrays;

public class selction {
    public static void main(String[] args){
        int[] arr = {5,3,2,4,1};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int start = 0;
            int last = arr.length - i - 1;
            int maxInd = getmaxInd(arr,start,last);
            swap(arr,maxInd,last);
        }
    }

    static void swap(int[] arr,int start,int last){
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }

    static int getmaxInd(int[] arr, int start,int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    
}
