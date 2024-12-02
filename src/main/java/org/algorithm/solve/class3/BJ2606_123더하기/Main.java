package org.algorithm.solve.class3.BJ2606_123더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static long[] dp = new long[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<=10; i++){
            for(int j=i-1; j>=i-3; j--){
                dp[i] += dp[j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            int input = Integer.parseInt(br.readLine());

            sb.append(dp[input]).append("\n");
        }
        System.out.println(sb);
    }
}
