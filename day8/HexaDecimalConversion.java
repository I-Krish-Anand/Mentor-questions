package com.day8;

public class HexaDecimalConversion {

        public static void main(String[] args) {
            String input = "hello world";
            String hex = stringToHex(input);
            System.out.println(hex);
        }

        public static String stringToHex(String input) {
            StringBuilder hex = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                hex.append(String.format("%02X", (int) input.charAt(i)));
            }
            return new String(hex);
        }


}
