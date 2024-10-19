package org.algorithm.sovle.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ10845_큐 {

    static List<Integer> queue = new ArrayList<>();

    static void push(int x){
        queue.add(x);
    }

    static int pop(){
        if(queue.size() == 0){
            return -1;
        }else{
            return queue.remove(0);
        }
    }

    static int size(){
        return queue.size();
    }

    static int isEmpty(){
        if(queue.size() > 0){
            return 0;
        }else{
            return 1;
        }
    }

    static int front(){
        if (size() == 0){
            return -1;
        }else{
            return queue.get(0);
        }
    }

    static int back(){
        if (size() == 0){
            return -1;
        }else{
            return queue.get(queue.size()-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(N != 0){
            String input = br.readLine();
            String[] inputArr = input.split(" ");

            switch (inputArr[0]){
                case "push":
                    push(Integer.parseInt(inputArr[1]));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(isEmpty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }

            N --;
        }
        System.out.println(sb);
        br.close();
    }
}
