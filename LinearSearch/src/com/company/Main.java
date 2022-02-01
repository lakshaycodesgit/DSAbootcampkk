package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        int ans = linearSearch(nums , target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]==target)
                 return i;
        }
        return -1;
    }
}
