package org.algorithm.solve.class3.BJ11723_집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ11723_집합 {
    static ArrayList<Integer> S = new ArrayList<>();
    static void add(int x){
        if(!S.contains(x)){
            S.add(x);
        }
    }

    static void remove(int x){
        if(S.contains(x)){
            S.remove(Integer.valueOf(x));
        }
    }

    static int check(int x){
        if(S.contains(x)){
            return 1;
        }else{
            return 0;
        }
    }

    static void toggle(int x){
        if(S.contains(x)){
            S.remove(Integer.valueOf(x));
        }else{
            S.add(x);
        }
    }

    static void all(){
        S = new ArrayList <Integer>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
    }

    static void empty(){
        S.clear();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(M != 0){
            String input = br.readLine();
            String[] inputArr = input.split(" ");
            String method = inputArr[0];

            if(inputArr.length == 1){
                switch (method){
                    case "all":
                        all();
                        break;
                    case "empty":
                        empty();
                        break;
                }
            }else{
                int parameter = Integer.parseInt(inputArr[1]);
                switch (method){
                    case "add":
                        add(parameter);
                        break;
                    case "check":
                        sb.append(check(parameter)).append("\n");
                        break;
                    case "remove":
                        remove(parameter);
                        break;
                    case "toggle":
                        toggle(parameter);
                        break;
                }
            }
            M--;
        }
        br.close();
        System.out.println(sb);
    }
}
