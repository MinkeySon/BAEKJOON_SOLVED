package org.algorithm.sovle.class3.BJ1003_피보나치함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Map<Integer, Integer>> lst = new ArrayList<>();
    static int T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        lst.add(new HashMap<>());
        lst.add(new HashMap<>());

        lst.get(0).put(1,0);
        lst.get(1).put(0,1);

        for(int i=2; i<=40; i++){
            Set set1 = lst.get(i-2).entrySet();
            Iterator iter1 = set1.iterator();
            Map.Entry<Integer, Integer> entry1 = (Map.Entry) iter1.next();

            Set set2 = lst.get(i-1).entrySet();
            Iterator iter2 = set2.iterator();
            Map.Entry<Integer, Integer> entry2 = (Map.Entry) iter2.next();

            lst.add(new HashMap<>());
            lst.get(i).put(entry1.getKey() + entry2.getKey(), entry1.getValue() + entry2.getValue());
        }
        StringBuilder sb = new StringBuilder();

        while(T != 0){
            int input = Integer.parseInt(br.readLine());

            Set resultSet = lst.get(input).entrySet();
            Iterator resultIter = resultSet.iterator();
            Map.Entry<Integer, Integer> resultEntry = (Map.Entry) resultIter.next();

            sb.append(resultEntry.getKey()).append(" ").append(resultEntry.getValue()).append("\n");
            T --;
        }

        System.out.println(sb);
    }
}
