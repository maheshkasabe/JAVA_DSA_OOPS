package com.search_sort.linear;

public class SearchInString {
    public static void main(String[] args){
        String S = "mahesh";
        char target = 'h';
        System.out.println(search(S, target));
    }


    static int search(String Str, char target){
        if(Str.length() == 0){
            return -1;
        }
        for(int i=0; i<Str.length(); i++){
            if(target == Str.charAt(i)){
                return i;
            }
        }
        return -1;
    }


}
