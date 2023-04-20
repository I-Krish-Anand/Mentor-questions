package com.day7;

import java.util.Arrays;

public class CovidCases {

    public static void main(String[] args) {

        int[]arr={10,11,12,8,9,13};
        int index=0;

        for(int i=0;i<arr.length;i++){

            while (index<arr.length && arr[index]>=arr[i])
                index++;

            if(index==arr.length)
                arr[i]=-1;
            else
             arr[i]=index-i;

        }
        System.out.println(Arrays.toString(arr));
    }
}
