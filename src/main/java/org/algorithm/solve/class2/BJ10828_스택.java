package org.algorithm.solve.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ10828_스택 {
    static List<Integer> stack = new ArrayList<>();

    static void push(int x){
        stack.add(x);
    }

    static int pop(){
        if(stack.size() == 0){
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    static int size(){
        return stack.size();
    }

    static int isEmpty(){
        if(stack.size() > 0){
            return 0;
        }else{
            return 1;
        }
    }

    static int top(){
        if(stack.size() == 0){
            return -1;
        }

        return stack.get(stack.size() - 1);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(N!=0){
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
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }

            N--;

        }
        System.out.println(sb);
        br.close();
    }
}
