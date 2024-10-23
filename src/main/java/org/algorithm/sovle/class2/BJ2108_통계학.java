package org.algorithm.sovle.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BJ2108_통계학 {
    static int N, middle, differ;
    static int best = 0;
    static long avg;
    static int sum = 0;
    static ArrayList<Integer> lst = new ArrayList<>();
    static int[] amnioticArr, negativeArr;

    static long average(){
        return Math.round(sum * 1.0 / lst.size());
    }
    static int differ(){
        if(lst.size() == 1){
            return 0;
        }else{
            return lst.get(lst.size()-1)- lst.get(0);
        }
    }
    static int middle(){
        if(lst.size() == 1){
            return lst.get(0);
        }else{
            return lst.get(lst.size() / 2);
        }
    }
    static int best(){
        if(lst.size() == 1){
            return lst.get(0);
        }

        int compare = 0;
        for(int e : lst){
            if(e < 0){
                int tmp = negativeArr[Math.abs(e)];
                if(compare <= tmp){
                    compare = tmp;
                    best = e;
                }
            }else{
                int tmp = amnioticArr[e];
                if(compare <= tmp){
                    compare = tmp;
                    best = e;
                }
            }
        }

        if(compare == 1){
            best = lst.get(1);
        }
        return best;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        amnioticArr = new int[4001];
        negativeArr = new int[4001];

        for(int i=0; i<N; i++){
            int input = Integer.parseInt(br.readLine());
            lst.add(input);

            if(input >= 0){
                amnioticArr[input] ++;
            }else{
                negativeArr[Math.abs(input)] ++;
            }

            sum += input;
        }

        br.close();
        avg = average();

        Collections.sort(lst);

        Map<Integer, Integer> map = new HashMap<>();
        for(int e : lst){
            map.put(e, map.getOrDefault(e,0)+1); // e 가 없으면 0을 넣어줌
        }

        ArrayList<Map.Entry<Integer, Integer>> frequencyList = new ArrayList<>(map.entrySet());
        Collections.sort(frequencyList, (a,b) -> {
            if(a.getValue() == b.getValue()){
                return a.getKey() - b.getKey();
            }else{
                return b.getValue() - a.getValue();
            }
        });

        best = frequencyList.size() > 1 && frequencyList.get(0).getValue() == frequencyList.get(1).getValue() ? frequencyList.get(1).getKey() : frequencyList.get(0).getKey();

        middle = middle();
        differ = differ();

        StringBuilder sb = new StringBuilder();
        sb.append(avg).append("\n").append(middle).append("\n").append(best).append("\n").append(differ);
        System.out.println(sb);
    }
}
