package org.algorithm.sovle.class3.BJ1697_숨바꼭질;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] arr;
    static boolean[] check;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[100_001];
        check = new boolean[100_001];

        bfs(N);
        System.out.println(arr[M]);
    }

    static void bfs(int v){
        Queue<Integer> queue = new LinkedList<>();
        arr[v] = 0;
        arr[0] = v;
        check[v] = true;
        queue.add(v);

        while(!queue.isEmpty()){
            int e = queue.poll();

            check[e] = true;
            int[] moveMap = move(e);

            for(int tmp : moveMap){
                if(isInMap(tmp)){
                    if(!check[tmp]){
                        check[tmp] = true;
                        arr[tmp] = arr[e] + 1;
                        queue.add(tmp);
                    }
                }
            }
        }
    }

    static int[] move(int n){
        int[] moveMap = new int[3];

        moveMap[0] = n-1;
        moveMap[1] = n+1;
        moveMap[2] = n*2;

        return moveMap;
    }
    static boolean isInMap(int n){
        return n > 0 && n < 100_001;
    }
}
