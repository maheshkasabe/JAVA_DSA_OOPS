package com.search_sort.linear;

public class minimumNumber {
    public static void main(String[] args){
        int[] arr = {89,3,-8,9,1,4};
        System.out.println(search(arr));
    }

    static int search(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
