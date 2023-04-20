package com.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NPairsOfNumbers {

    public static void main(String[] args) {

        int[][]arr={{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90} };
        List<List<Integer>>maxlist=new ArrayList<>();
        NPairsOfNumbers nPairsOfNumbers=new NPairsOfNumbers();
        nPairsOfNumbers.func(0,arr,new ArrayList<>(),Integer.MIN_VALUE,maxlist);
        System.out.println(maxlist);

    }

    public void func(int i, int[][] arr, List<List<Integer>> list, int prevPick, List<List<Integer>> maxList) {
        if (i == arr.length) {
            if (list.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(list);
            }
            return;
        }

        if (arr[i][0] >= prevPick) {
            List<Integer> temp = Arrays.asList(arr[i][0], arr[i][1]);
            list.add(temp);
            func(i + 1, arr, list, arr[i][1], maxList);
            list.remove(list.size() - 1);
        }
        func(i + 1, arr, list, prevPick, maxList);
    }
}
