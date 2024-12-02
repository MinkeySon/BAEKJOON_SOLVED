package org.algorithm.solve.class3.BJ11724_연결요소의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] lst;
    static StringTokenizer st;
    static boolean[] check;
    static int N, M;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        lst = new ArrayList[N+1];
        check = new boolean[N+1];

        for(int i=1; i<=N; i++){
            lst[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int index = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            lst[index].add(value);
            lst[value].add(index);
        }
        for(int i=1; i<=N; i++){
            if(!check[i]){
                cnt++;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }

    static void dfs(int v){
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        check[v] = true;

        while(!stack.isEmpty()){
            int key = stack.pop();
            ArrayList<Integer> tmpLst = lst[key];

            for(int e : tmpLst){
                if(!check[e]){
                    check[e] = true;
                    stack.push(e);
                }
            }
        }
    }
}
