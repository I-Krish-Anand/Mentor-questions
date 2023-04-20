package com.day7;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();

        for(int i=0;i<str.length();i++){

           if(i<str.length()/2) {
               int limit = (str.length()/2 - i) , temp = i;
               for (int j = 0; j < str.length() - i; j++) {

                   if (j == temp) {
                       System.out.print(str.charAt(i));
                       temp += limit;
                   }
                   else System.out.print(" ");
               }
           }
           else if(i==str.length()/2)
               System.out.print(str);

           else {

               int limit = i-str.length()/2 , temp = i;
               for (int j = str.length()-1; j >=str.length() - i-1; j--) {

                   if (j == temp) {
                       System.out.print(str.charAt(i));
                       temp -= limit;
                   }
                   else System.out.print(" ");

               }
           }


            System.out.println();
        }
    }
}
