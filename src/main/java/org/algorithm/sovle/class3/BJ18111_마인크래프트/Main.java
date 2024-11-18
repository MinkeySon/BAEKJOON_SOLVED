package org.algorithm.sovle.class3.BJ18111_마인크래프트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static int sec = Integer.MAX_VALUE;
    static int h = Integer.MIN_VALUE;
    static int max = 0;
    static int min = 257;
    static int addSec = 1;
    static int dropSec = 2;
    static StringTokenizer st;
    static int[] countArr;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][M + 1];
        countArr = new int[257];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= M; j++) {
                int e = Integer.parseInt(st.nextToken());
                if(e > max){
                    max = e;
                }

                if(e < min){
                    min = e;
                }
                arr[i][j] = e;
            }
        }

        for(int height=min; height<=max; height++){
            int time = 0;
            int block = B;

            for(int i=1; i<=N; i++){
                for(int j=1; j<=M; j++){
                    int dif = arr[i][j] - height;

                    if(dif > 0){
                        time += dif * 2;
                        block += dif;
                    }

                    if(dif < 0){
                        time += Math.abs(dif);
                        block += dif;
                    }
                }
            }

            if(block < 0){
                continue;
            }

            if(sec >= time){
                h = height;
                sec = time;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sec).append(" ").append(h);
        br.close();
        System.out.println(sb);

    }
}
