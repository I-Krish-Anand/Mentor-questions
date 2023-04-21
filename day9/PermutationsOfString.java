package com.day9;

import java.util.Arrays;
import java.util.Scanner;

//Given a string S. The task is to print all unique permutations of the given string in lexicographically sorted order.
public class PermutationsOfString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        new PermutationsOfString().permutations(arr, new boolean[str.length()], "");


    }

    void permutations(char[] arr, boolean[] map, String result) {


        if (result.length() == arr.length) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (!map[i]) {
                map[i] = true;
                permutations(arr, map, result + arr[i]);
                map[i] = false;
            }

        }


    }
}
