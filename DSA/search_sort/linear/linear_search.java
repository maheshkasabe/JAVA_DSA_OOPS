package com.search_sort.linear;

public class linear_search {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
