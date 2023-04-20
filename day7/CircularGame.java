package com.day7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CircularGame {

    public static void main(String[]args){

        Queue<Integer> queue=new LinkedList<>();

        int n=9,x=4;
        int count=1;

        for(int i=1;i<=n;i++)
            queue.add(i);

        while (queue.size()>=x){

            Integer temp=queue.poll();
            if(count++!=x)
                queue.add(temp);
            else
            {
                System.out.println(temp);
                count=1;
            }
        }

    }
}
