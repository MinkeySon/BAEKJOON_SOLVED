package org.algorithm.solve.class3.BJ1012_유기농배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] check;
    static int[][] map;
    static int T, M, N, K;
    static int now_x, now_y;
    static int cnt = 0;
    static int[] move_x = {0,0,1,-1};
    static int[] move_y = {1,-1,0,0};
    static StringTokenizer st;
    static Stack<Node> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();

    static class Node{
        int x;
        int y;

        Node(int y, int x){
            this.y = y;
            this.x = x;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        while(T != 0){
            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            check = new boolean[N][M];

            for(int i=0; i<K; i++){
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[y][x] = 1;
            }

            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(map[i][j] == 1 && !check[i][j]){
                        System.out.println("좌표 : ["+i+"]["+j+"]");
                        System.out.println("방문여부 : "+check[i][j]);
                        cnt++;
                        DFS(i, j);
                    }
                }
            }
            sb.append(cnt).append("\n");

            T--;
            cnt = 0;
        }
        System.out.println(sb);

    }
    static void DFS(int y, int x){
        Node node = new Node(y, x);
        stack.push(node);
        check[node.y][node.x] = true;

        while(!stack.isEmpty()){
            Node n = stack.pop();

            for(int i=0; i<4; i++){
                now_y = n.y + move_y[i];
                now_x = n.x + move_x[i];

                if(checkCoordinate() && map[now_y][now_x] == 1 && !check[now_y][now_x]){
                    stack.push(new Node(now_y, now_x));
                    check[now_y][now_x] = true;
                }
            }
        }
    }
    static boolean checkCoordinate(){
        return now_x >=0 && now_y >= 0 && now_x < M && now_y <N;
    }
}
