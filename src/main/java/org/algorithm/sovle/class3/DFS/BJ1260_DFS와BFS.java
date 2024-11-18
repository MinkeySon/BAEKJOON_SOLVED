package org.algorithm.sovle.class3.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ1260_DFS와BFS {
    static int N;
    static int M;
    static int V;
    static StringTokenizer st;
    static int[][] arr;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        st = new StringTokenizer(input, " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N+1][N+1];
        check = new boolean[N+1];

        for(int i=0; i<M; i++){ // 인접한 노드에 1 저장
            input = br.readLine();

            st = new StringTokenizer(input, " ");

            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            arr[row][col] = 1;
            arr[col][row] = 1;
        }

        dfs(V);
        sb.append("\n");
        bfs(V);
        System.out.println(sb);
    }

    static void dfs(int startIndex){
        check[startIndex] = true;
        sb.append(startIndex).append(" ");

        for(int i=1; i<=N; i++){
            if(arr[startIndex][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int startIndex){
        check = new boolean[N+1];

        q.add(startIndex);
        check[startIndex] = true;
        sb.append(startIndex).append(" ");

        while(!q.isEmpty()){
            int front = q.poll();

            for(int i=1; i<=N; i++){
                if(arr[front][i] == 1 && !check[i]){
                    sb.append(i).append(" ");
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
