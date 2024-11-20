package org.algorithm.sovle.class3.BJ18870_좌표압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N;
    static StringTokenizer st;
    static ArrayList<Integer> lst = new ArrayList<>();
    static ArrayList<Integer> checkLst = new ArrayList<>();
    static HashMap<Integer, Integer> hashMap = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++){
            int v = Integer.parseInt(st.nextToken());
            lst.add(v);
            checkLst.add(v);
        }

        lst.sort((a,b)-> a-b);

        int rank = 0;
        for(int e : lst){
            if(!hashMap.containsKey(e)){
                hashMap.put(e,rank);
                rank++;
            }
        }

        for (int e : checkLst){
            sb.append(hashMap.get(e)).append(" ");
        }

        br.close();
        System.out.println(sb);
    }
}
