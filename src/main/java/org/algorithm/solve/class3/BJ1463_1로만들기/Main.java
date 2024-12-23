package org.algorithm.solve.class3.BJ1463_1로만들기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] dp;

    static void createDP(int N){
        for(int i=2; i<=N; i++){
            dp[i] = dp[i-1] + 1;

            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        if(N==1){
            System.out.println(0);
        }else{
            dp = new int[N + 1];
            createDP(N);

            System.out.println(dp[N]);
        }
    }
}
