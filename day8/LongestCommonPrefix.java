package com.day8;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};
        boolean flag = false;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr[0].length(); i++) {

            char ch = arr[0].charAt(i);

            for (int j = 1; j < arr.length; j++) {

                if (arr[j].length() == i || ch != arr[j].charAt(i)) {
                    flag = true;
                    break;
                }

            }

            if (flag)
                break;

            result.append(ch);
        }
        System.out.println(result);
    }
}
