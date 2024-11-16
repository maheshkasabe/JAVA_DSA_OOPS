package com.search_sort.cyclic_sort;

public class missing_number {
    public static void main(String[] args){
    int[] arr = {0,1,2,4};
    int ans = cycle(arr);
    System.out.println((ans));
    }

    static int cycle(int[] arr){
        int i =0;    
        while(i<arr.length){
            int cInd = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[cInd]){
                swap(arr,i,cInd);
            }else{
                return arr[i];
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }

        return arr.length;

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
