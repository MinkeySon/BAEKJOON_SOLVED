package org.algorithm.solve.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] S = new int[N+1][N+1];

        for(int i=1; i <= N; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=1; j<=N; j++){
                S[i][j] = S[i-1][j] + S[i][j-1] + Integer.parseInt(st.nextToken()) - S[i-1][j-1];
            }
        }

        int x1,x2,y1,y2;
        int rst;

        for(int i=0; i<M; i++){
            st = new StringTokenizer(bf.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            rst = S[x2][y2] - (S[x2][y1-1]+S[x1-1][y2]-S[x1-1][y1-1]);
            System.out.println(rst);
        }
    }
}
