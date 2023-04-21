package com.day9;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to in-place move all zeros to the end in the given integer array. Without using extra array
public class MoveZeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[]arr= new int[size];

        for(int i=0;i<arr.length;i++)
            arr[i]=scanner.nextInt();

        int index=0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0)
                arr[index++]=arr[i];
        }

        for(int i=index;i<arr.length;i++)
            arr[i]=0;

        System.out.println(Arrays.toString(arr));

    }
}
